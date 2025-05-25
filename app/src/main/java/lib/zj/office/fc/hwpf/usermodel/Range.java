package lib.zj.office.fc.hwpf.usermodel;

import a0.a;
import a6.h;
import androidx.appcompat.view.menu.d;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.NoSuchElementException;
import lib.zj.office.fc.hwpf.HWPFDocumentCore;
import lib.zj.office.fc.hwpf.model.CHPX;
import lib.zj.office.fc.hwpf.model.FileInformationBlock;
import lib.zj.office.fc.hwpf.model.ListTables;
import lib.zj.office.fc.hwpf.model.PAPX;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.hwpf.model.SEPX;
import lib.zj.office.fc.hwpf.model.StyleSheet;
import lib.zj.office.fc.hwpf.model.SubdocumentType;
import lib.zj.office.fc.hwpf.sprm.CharacterSprmCompressor;
import lib.zj.office.fc.hwpf.sprm.ParagraphSprmCompressor;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class Range {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TYPE_CHARACTER = 1;
    public static final int TYPE_LISTENTRY = 4;
    public static final int TYPE_PARAGRAPH = 0;
    public static final int TYPE_SECTION = 2;
    public static final int TYPE_TABLE = 5;
    public static final int TYPE_TEXT = 3;
    public static final int TYPE_UNDEFINED = 6;
    protected int _charEnd;
    protected boolean _charRangeFound;
    protected int _charStart;
    protected List<CHPX> _characters;
    protected HWPFDocumentCore _doc;
    protected int _end;
    protected int _parEnd;
    protected boolean _parRangeFound;
    protected int _parStart;
    protected List<PAPX> _paragraphs;
    private WeakReference<Range> _parent;
    protected int _sectionEnd;
    boolean _sectionRangeFound;
    protected int _sectionStart;
    protected List<SEPX> _sections;
    protected int _start;
    protected StringBuilder _text;

    public Range(int i10, int i11, HWPFDocumentCore hWPFDocumentCore) {
        this._start = i10;
        this._end = i11;
        this._doc = hWPFDocumentCore;
        this._sections = hWPFDocumentCore.getSectionTable().getSections();
        this._paragraphs = this._doc.getParagraphTable().getParagraphs();
        this._characters = this._doc.getCharacterTable().getTextRuns();
        this._text = this._doc.getText();
        this._parent = new WeakReference<>(null);
        sanityCheckStartEnd();
    }

    private void adjustForInsert(int i10) {
        this._end += i10;
        reset();
        Range range = this._parent.get();
        if (range != null) {
            range.adjustForInsert(i10);
        }
    }

    private static int binarySearchEnd(List<? extends PropertyNode<?>> list, int i10, int i11) {
        if (((PropertyNode) a.f(list, -1)).getEnd() <= i11) {
            return list.size() - 1;
        }
        int size = list.size() - 1;
        while (i10 <= size) {
            int i12 = (i10 + size) >>> 1;
            PropertyNode<?> propertyNode = list.get(i12);
            if (propertyNode.getEnd() < i11) {
                i10 = i12 + 1;
            } else if (propertyNode.getEnd() > i11) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return i10;
    }

    private static int binarySearchStart(List<? extends PropertyNode<?>> list, int i10) {
        int i11 = 0;
        if (list.get(0).getStart() >= i10) {
            return 0;
        }
        int size = list.size() - 1;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            PropertyNode<?> propertyNode = list.get(i12);
            if (propertyNode.getStart() < i10) {
                i11 = i12 + 1;
            } else if (propertyNode.getStart() > i10) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return i11 - 1;
    }

    private int[] findRange(List<? extends PropertyNode<?>> list, int i10, int i11) {
        int binarySearchStart = binarySearchStart(list, i10);
        while (binarySearchStart > 0 && list.get(binarySearchStart - 1).getStart() >= i10) {
            binarySearchStart--;
        }
        int binarySearchEnd = binarySearchEnd(list, binarySearchStart, i11);
        while (binarySearchEnd < list.size() - 1 && list.get(binarySearchEnd + 1).getEnd() <= i11) {
            binarySearchEnd--;
        }
        if (binarySearchStart >= 0 && binarySearchStart < list.size() && binarySearchStart <= binarySearchEnd && binarySearchEnd >= 0 && binarySearchEnd < list.size()) {
            return new int[]{binarySearchStart, binarySearchEnd + 1};
        }
        throw new AssertionError();
    }

    private void initCharacterRuns() {
        if (!this._charRangeFound) {
            int[] findRange = findRange(this._characters, this._start, this._end);
            this._charStart = findRange[0];
            this._charEnd = findRange[1];
            this._charRangeFound = true;
        }
    }

    private void initParagraphs() {
        if (!this._parRangeFound) {
            int[] findRange = findRange(this._paragraphs, this._start, this._end);
            this._parStart = findRange[0];
            this._parEnd = findRange[1];
            this._parRangeFound = true;
        }
    }

    private void initSections() {
        if (!this._sectionRangeFound) {
            int[] findRange = findRange(this._sections, this._sectionStart, this._start, this._end);
            this._sectionStart = findRange[0];
            this._sectionEnd = findRange[1];
            this._sectionRangeFound = true;
        }
    }

    private void sanityCheckStartEnd() {
        int i10 = this._start;
        if (i10 >= 0) {
            if (this._end >= i10) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("The end (");
            sb2.append(this._end);
            sb2.append(") must not be before the start (");
            throw new IllegalArgumentException(h.g(sb2, this._start, ")"));
        }
        throw new IllegalArgumentException("Range start must not be negative. Given " + this._start);
    }

    public static String stripFields(String str) {
        int lastIndexOf;
        if (str.indexOf(19) == -1) {
            return str;
        }
        while (str.indexOf(19) > -1 && str.indexOf(21) > -1) {
            int indexOf = str.indexOf(19);
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(19, i10);
            int indexOf3 = str.indexOf(20, i10);
            if (str.lastIndexOf(21) >= indexOf) {
                if (indexOf2 == -1 && indexOf3 == -1) {
                    return str.substring(0, indexOf) + str.substring(lastIndexOf + 1);
                } else if (indexOf3 != -1 && (indexOf3 < indexOf2 || indexOf2 == -1)) {
                    str = str.substring(0, indexOf) + str.substring(indexOf3 + 1, lastIndexOf) + str.substring(lastIndexOf + 1);
                } else {
                    str = str.substring(0, indexOf) + str.substring(lastIndexOf + 1);
                }
            } else {
                return str;
            }
        }
        return str;
    }

    public void adjustFIB(int i10) {
        SubdocumentType[] subdocumentTypeArr;
        FileInformationBlock fileInformationBlock = this._doc.getFileInformationBlock();
        int i11 = 0;
        for (SubdocumentType subdocumentType : SubdocumentType.ORDERED) {
            int subdocumentTextStreamLength = fileInformationBlock.getSubdocumentTextStreamLength(subdocumentType);
            i11 += subdocumentTextStreamLength;
            if (this._start <= i11) {
                fileInformationBlock.setSubdocumentTextStreamLength(subdocumentType, subdocumentTextStreamLength + i10);
                return;
            }
        }
    }

    public void delete() {
        initAll();
        int size = this._sections.size();
        int size2 = this._characters.size();
        int size3 = this._paragraphs.size();
        for (int i10 = this._charStart; i10 < size2; i10++) {
            int i11 = this._start;
            this._characters.get(i10).adjustForDelete(i11, this._end - i11);
        }
        for (int i12 = this._parStart; i12 < size3; i12++) {
            int i13 = this._start;
            this._paragraphs.get(i12).adjustForDelete(i13, this._end - i13);
        }
        for (int i14 = this._sectionStart; i14 < size; i14++) {
            int i15 = this._start;
            this._sections.get(i14).adjustForDelete(i15, this._end - i15);
        }
        this._text.delete(this._start, this._end);
        Range range = this._parent.get();
        if (range != null) {
            range.adjustForInsert(-(this._end - this._start));
        }
        adjustFIB(-(this._end - this._start));
    }

    public CharacterRun getCharacterRun(int i10) {
        short istd;
        initCharacterRuns();
        int i11 = this._charStart;
        if (i10 + i11 < this._charEnd) {
            CHPX chpx = this._characters.get(i10 + i11);
            if (chpx == null) {
                return null;
            }
            if (this instanceof Paragraph) {
                istd = ((Paragraph) this)._istd;
            } else {
                int[] findRange = findRange(this._paragraphs, Math.max(chpx.getStart(), this._start), Math.min(chpx.getEnd(), this._end));
                initParagraphs();
                if (Math.max(findRange[0], this._parStart) >= this._paragraphs.size()) {
                    return null;
                }
                istd = this._paragraphs.get(findRange[0]).getIstd();
            }
            return new CharacterRun(chpx, this._doc.getStyleSheet(), istd, this);
        }
        StringBuilder e10 = d.e("CHPX #", i10, " (");
        e10.append(i10 + this._charStart);
        e10.append(") not in range [");
        e10.append(this._charStart);
        e10.append("; ");
        throw new IndexOutOfBoundsException(h.g(e10, this._charEnd, ")"));
    }

    public CharacterRun getCharacterRunByOffset(long j10) {
        CHPX chpx;
        short istd;
        int size = this._characters.size();
        int i10 = 0;
        while (true) {
            int i11 = (size + i10) / 2;
            chpx = this._characters.get(i11);
            int start = chpx.getStart();
            int end = chpx.getEnd();
            long j11 = start;
            if (j10 >= j11 && j10 < end) {
                break;
            } else if (j11 > j10) {
                size = i11 - 1;
            } else if (end <= j10) {
                i10 = i11 + 1;
            }
        }
        if (this instanceof Paragraph) {
            istd = ((Paragraph) this)._istd;
        } else {
            int[] findRange = findRange(this._paragraphs, Math.max(chpx.getStart(), this._start), Math.min(chpx.getEnd(), this._end));
            initParagraphs();
            if (Math.max(findRange[0], this._parStart) >= this._paragraphs.size()) {
                return null;
            }
            istd = this._paragraphs.get(findRange[0]).getIstd();
        }
        return new CharacterRun(chpx, this._doc.getStyleSheet(), istd, this);
    }

    public HWPFDocumentCore getDocument() {
        return this._doc;
    }

    public int getEndOffset() {
        return this._end;
    }

    public Paragraph getParagraph(int i10) {
        initParagraphs();
        int i11 = this._parStart;
        if (i10 + i11 < this._parEnd) {
            PAPX papx = this._paragraphs.get(i11 + i10);
            if (papx.getParagraphProperties(this._doc.getStyleSheet()).getIlfo() > 0) {
                return new ListEntry(papx, this, this._doc.getListTables());
            }
            if (i10 + this._parStart == 0 && papx.getStart() > 0) {
                return new Paragraph(papx, this, 0);
            }
            return new Paragraph(papx, this);
        }
        StringBuilder e10 = d.e("Paragraph #", i10, " (");
        e10.append(i10 + this._parStart);
        e10.append(") not in range [");
        e10.append(this._parStart);
        e10.append("; ");
        throw new IndexOutOfBoundsException(h.g(e10, this._parEnd, ")"));
    }

    public Section getSection(int i10) {
        initSections();
        if (this._sectionStart + i10 < this._sections.size()) {
            return new Section(this._sections.get(i10 + this._sectionStart), this);
        }
        return null;
    }

    public int getStartOffset() {
        return this._start;
    }

    public Table getTable(Paragraph paragraph) {
        if (paragraph.isInTable()) {
            if (paragraph._parent.get() == this) {
                paragraph.initAll();
                int tableLevel = paragraph.getTableLevel();
                int i10 = paragraph._parStart;
                if (i10 != 0) {
                    Paragraph paragraph2 = new Paragraph(this._paragraphs.get(i10 - 1), this);
                    if (paragraph2.isInTable() && paragraph2.getTableLevel() == tableLevel && paragraph2._sectionEnd >= paragraph._sectionStart) {
                        throw new IllegalArgumentException("This paragraph is not the first one in the table");
                    }
                }
                Range overallRange = this._doc.getOverallRange();
                int size = this._paragraphs.size();
                while (i10 < size - 1) {
                    int i11 = i10 + 1;
                    Paragraph paragraph3 = new Paragraph(this._paragraphs.get(i11), overallRange);
                    if (!paragraph3.isInTable() || paragraph3.getTableLevel() < tableLevel) {
                        break;
                    }
                    i10 = i11;
                }
                initAll();
                if (i10 >= 0) {
                    return new Table(paragraph.getStartOffset(), this._paragraphs.get(i10).getEnd(), this, paragraph.getTableLevel());
                }
                throw new ArrayIndexOutOfBoundsException("The table's end is negative, which isn't allowed!");
            }
            throw new IllegalArgumentException("This paragraph is not a child of this range instance");
        }
        throw new IllegalArgumentException("This paragraph doesn't belong to a table");
    }

    public void initAll() {
        initCharacterRuns();
        initParagraphs();
        initSections();
    }

    public CharacterRun insertAfter(String str) {
        initAll();
        this._text.insert(this._end, str);
        this._doc.getCharacterTable().adjustForInsert(this._charEnd - 1, str.length());
        this._doc.getParagraphTable().adjustForInsert(this._parEnd - 1, str.length());
        this._doc.getSectionTable().adjustForInsert(this._sectionEnd - 1, str.length());
        adjustForInsert(str.length());
        return getCharacterRun(numCharacterRuns() - 1);
    }

    public CharacterRun insertBefore(String str) {
        initAll();
        this._text.insert(this._start, str);
        this._doc.getCharacterTable().adjustForInsert(this._charStart, str.length());
        this._doc.getParagraphTable().adjustForInsert(this._parStart, str.length());
        this._doc.getSectionTable().adjustForInsert(this._sectionStart, str.length());
        adjustForInsert(str.length());
        adjustFIB(str.length());
        return getCharacterRun(0);
    }

    public Table insertTableBefore(short s4, int i10) {
        ParagraphProperties paragraphProperties = new ParagraphProperties();
        paragraphProperties.setFInTable(true);
        paragraphProperties.setItap(1);
        int i11 = this._end;
        for (int i12 = 0; i12 < i10; i12++) {
            Paragraph insertBefore = insertBefore(paragraphProperties, 4095);
            insertBefore.insertAfter(String.valueOf((char) 7));
            for (int i13 = 1; i13 < s4; i13++) {
                insertBefore = insertBefore.insertAfter(paragraphProperties, 4095);
                insertBefore.insertAfter(String.valueOf((char) 7));
            }
            insertBefore.insertAfter(paragraphProperties, 4095, String.valueOf((char) 7)).setTableRowEnd(new TableProperties(s4));
        }
        int i14 = this._start;
        return new Table(i14, (this._end - i11) + i14, this, 1);
    }

    public int numCharacterRuns() {
        initCharacterRuns();
        return this._charEnd - this._charStart;
    }

    public int numParagraphs() {
        initParagraphs();
        return this._parEnd - this._parStart;
    }

    public int numSections() {
        initSections();
        return this._sectionEnd - this._sectionStart;
    }

    public void replaceText(String str, String str2, int i10) {
        int startOffset = getStartOffset() + i10;
        new Range(startOffset, str.length() + startOffset, this).insertBefore(str2);
        new Range(str2.length() + startOffset, str2.length() + str.length() + startOffset, this).delete();
    }

    public void reset() {
        this._charRangeFound = false;
        this._parRangeFound = false;
        this._sectionRangeFound = false;
    }

    public boolean sanityCheck() {
        int i10 = this._start;
        if (i10 >= 0) {
            if (i10 <= this._text.length()) {
                int i11 = this._end;
                if (i11 >= 0) {
                    if (i11 <= this._text.length()) {
                        if (this._start <= this._end) {
                            if (this._charRangeFound) {
                                for (int i12 = this._charStart; i12 < this._charEnd; i12++) {
                                    CHPX chpx = this._characters.get(i12);
                                    if (Math.max(this._start, chpx.getStart()) >= Math.min(this._end, chpx.getEnd())) {
                                        throw new AssertionError();
                                    }
                                }
                            }
                            if (this._parRangeFound) {
                                for (int i13 = this._parStart; i13 < this._parEnd; i13++) {
                                    PAPX papx = this._paragraphs.get(i13);
                                    if (Math.max(this._start, papx.getStart()) >= Math.min(this._end, papx.getEnd())) {
                                        throw new AssertionError();
                                    }
                                }
                                return true;
                            }
                            return true;
                        }
                        throw new AssertionError();
                    }
                    throw new AssertionError();
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public String text() {
        return this._text.substring(this._start, this._end);
    }

    public String toString() {
        return "Range from " + getStartOffset() + " to " + getEndOffset() + " (chars)";
    }

    public int type() {
        return 6;
    }

    @Deprecated
    public boolean usesUnicode() {
        return true;
    }

    @Deprecated
    public CharacterRun insertAfter(String str, CharacterProperties characterProperties) {
        initAll();
        this._doc.getCharacterTable().insert(this._charEnd, this._end, new SprmBuffer(CharacterSprmCompressor.compressCharacterProperty(characterProperties, this._doc.getStyleSheet().getCharacterStyle(this._paragraphs.get(this._parEnd - 1).getIstd())), 0));
        this._charEnd++;
        return insertAfter(str);
    }

    public void replaceText(String str, String str2) {
        boolean z10 = true;
        while (z10) {
            int indexOf = text().indexOf(str);
            if (indexOf >= 0) {
                replaceText(str, str2, indexOf);
            } else {
                z10 = false;
            }
        }
    }

    private int[] findRange(List<? extends PropertyNode<?>> list, int i10, int i11, int i12) {
        PropertyNode<?> propertyNode;
        if (list.size() == i10) {
            return new int[]{i10, i10};
        }
        PropertyNode<?> propertyNode2 = list.get(i10);
        while (true) {
            propertyNode = propertyNode2;
            if (propertyNode == null || (propertyNode.getEnd() <= i11 && i10 < list.size() - 1)) {
                i10++;
                if (i10 >= list.size()) {
                    return new int[]{0, 0};
                }
                propertyNode2 = list.get(i10);
            }
        }
        if (propertyNode.getStart() > i12) {
            return new int[]{0, 0};
        }
        if (propertyNode.getEnd() <= i11) {
            return new int[]{list.size(), list.size()};
        }
        for (int i13 = i10; i13 < list.size(); i13++) {
            PropertyNode<?> propertyNode3 = list.get(i13);
            if (propertyNode3 != null && (propertyNode3.getStart() >= i12 || propertyNode3.getEnd() > i12)) {
                if (propertyNode3.getStart() < i12) {
                    return new int[]{i10, i13 + 1};
                }
                return new int[]{i10, i13};
            }
        }
        return new int[]{i10, list.size()};
    }

    @Deprecated
    public CharacterRun insertBefore(String str, CharacterProperties characterProperties) {
        initAll();
        this._doc.getCharacterTable().insert(this._charStart, this._start, new SprmBuffer(CharacterSprmCompressor.compressCharacterProperty(characterProperties, this._doc.getStyleSheet().getCharacterStyle(this._paragraphs.get(this._parStart).getIstd())), 0));
        return insertBefore(str);
    }

    public Range(int i10, int i11, Range range) {
        this._start = i10;
        this._end = i11;
        this._doc = range._doc;
        this._sections = range._sections;
        this._paragraphs = range._paragraphs;
        this._characters = range._characters;
        this._text = range._text;
        this._parent = new WeakReference<>(range);
        sanityCheckStartEnd();
    }

    @Deprecated
    public Paragraph insertAfter(ParagraphProperties paragraphProperties, int i10) {
        return insertAfter(paragraphProperties, i10, "\r");
    }

    @Deprecated
    public Paragraph insertBefore(ParagraphProperties paragraphProperties, int i10) {
        return insertBefore(paragraphProperties, i10, "\r");
    }

    @Deprecated
    public Paragraph insertAfter(ParagraphProperties paragraphProperties, int i10, String str) {
        initAll();
        StyleSheet styleSheet = this._doc.getStyleSheet();
        ParagraphProperties paragraphStyle = styleSheet.getParagraphStyle(i10);
        CharacterProperties characterStyle = styleSheet.getCharacterStyle(i10);
        byte[] compressParagraphProperty = ParagraphSprmCompressor.compressParagraphProperty(paragraphProperties, paragraphStyle);
        byte[] bArr = new byte[compressParagraphProperty.length + 2];
        LittleEndian.putShort(bArr, (short) i10);
        System.arraycopy(compressParagraphProperty, 0, bArr, 2, compressParagraphProperty.length);
        this._doc.getParagraphTable().insert(this._parEnd, this._end, new SprmBuffer(bArr, 2));
        this._parEnd++;
        insertAfter(str, characterStyle);
        return getParagraph(numParagraphs() - 1);
    }

    @Deprecated
    public Paragraph insertBefore(ParagraphProperties paragraphProperties, int i10, String str) {
        initAll();
        StyleSheet styleSheet = this._doc.getStyleSheet();
        ParagraphProperties paragraphStyle = styleSheet.getParagraphStyle(i10);
        CharacterProperties characterStyle = styleSheet.getCharacterStyle(i10);
        byte[] compressParagraphProperty = ParagraphSprmCompressor.compressParagraphProperty(paragraphProperties, paragraphStyle);
        byte[] bArr = new byte[compressParagraphProperty.length + 2];
        LittleEndian.putShort(bArr, (short) i10);
        System.arraycopy(compressParagraphProperty, 0, bArr, 2, compressParagraphProperty.length);
        this._doc.getParagraphTable().insert(this._parStart, this._start, new SprmBuffer(bArr, 2));
        insertBefore(str, characterStyle);
        return getParagraph(0);
    }

    @Deprecated
    public Range(int i10, int i11, int i12, Range range) {
        this._doc = range._doc;
        this._sections = range._sections;
        this._paragraphs = range._paragraphs;
        this._characters = range._characters;
        this._text = range._text;
        this._parent = new WeakReference<>(range);
        sanityCheckStartEnd();
    }

    @Deprecated
    public Table insertBefore(TableProperties tableProperties, int i10) {
        ParagraphProperties paragraphProperties = new ParagraphProperties();
        paragraphProperties.setFInTable(true);
        paragraphProperties.setItap(1);
        int i11 = this._end;
        short itcMac = tableProperties.getItcMac();
        for (int i12 = 0; i12 < i10; i12++) {
            Paragraph insertBefore = insertBefore(paragraphProperties, 4095);
            insertBefore.insertAfter(String.valueOf((char) 7));
            for (int i13 = 1; i13 < itcMac; i13++) {
                insertBefore = insertBefore.insertAfter(paragraphProperties, 4095);
                insertBefore.insertAfter(String.valueOf((char) 7));
            }
            insertBefore.insertAfter(paragraphProperties, 4095, String.valueOf((char) 7)).setTableRowEnd(tableProperties);
        }
        int i14 = this._start;
        return new Table(i14, (this._end - i11) + i14, this, 1);
    }

    @Deprecated
    public ListEntry insertAfter(ParagraphProperties paragraphProperties, int i10, int i11, int i12) {
        ListTables listTables = this._doc.getListTables();
        if (listTables.getLevel(i10, i11) != null) {
            paragraphProperties.setIlfo(listTables.getOverrideIndexFromListID(i10));
            paragraphProperties.setIlvl((byte) i11);
            return (ListEntry) insertAfter(paragraphProperties, i12);
        }
        throw new NoSuchElementException("The specified list and level do not exist");
    }

    @Deprecated
    public ListEntry insertBefore(ParagraphProperties paragraphProperties, int i10, int i11, int i12) {
        ListTables listTables = this._doc.getListTables();
        if (listTables.getLevel(i10, i11) != null) {
            paragraphProperties.setIlfo(listTables.getOverrideIndexFromListID(i10));
            paragraphProperties.setIlvl((byte) i11);
            return (ListEntry) insertBefore(paragraphProperties, i12);
        }
        throw new NoSuchElementException("The specified list and level do not exist");
    }
}
