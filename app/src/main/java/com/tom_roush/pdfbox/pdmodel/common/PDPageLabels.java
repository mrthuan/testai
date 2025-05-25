package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class PDPageLabels implements COSObjectable {
    private PDDocument doc;
    private Map<Integer, PDPageLabelRange> labels;

    /* loaded from: classes2.dex */
    public static class LabelGenerator implements Iterator<String> {
        private static final String[][] ROMANS = {new String[]{"", OperatorName.SET_FLATNESS, "ii", "iii", "iv", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "vi", "vii", "viii", "ix"}, new String[]{"", "x", "xx", "xxx", "xl", OperatorName.LINE_TO, "lx", "lxx", "lxxx", "xc"}, new String[]{"", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", OperatorName.CONCAT}};
        private int currentPage = 0;
        private final PDPageLabelRange labelInfo;
        private final int numPages;

        public LabelGenerator(PDPageLabelRange pDPageLabelRange, int i10) {
            this.labelInfo = pDPageLabelRange;
            this.numPages = i10;
        }

        private String getNumber(int i10, String str) {
            if ("D".equals(str)) {
                return Integer.toString(i10);
            }
            if ("a".equals(str)) {
                return makeLetterLabel(i10);
            }
            if ("A".equals(str)) {
                return makeLetterLabel(i10).toUpperCase();
            }
            if ("r".equals(str)) {
                return makeRomanLabel(i10);
            }
            if ("R".equals(str)) {
                return makeRomanLabel(i10).toUpperCase();
            }
            return Integer.toString(i10);
        }

        private static String makeLetterLabel(int i10) {
            StringBuilder sb2 = new StringBuilder();
            int i11 = i10 / 26;
            int i12 = i10 % 26;
            int signum = Integer.signum(i12) + i11;
            int signum2 = ((((1 - Integer.signum(i12)) * 26) + i12) + 97) - 1;
            for (int i13 = 0; i13 < signum; i13++) {
                sb2.appendCodePoint(signum2);
            }
            return sb2.toString();
        }

        private static String makeRomanLabel(int i10) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 3 && i10 > 0; i11++) {
                sb2.insert(0, ROMANS[i11][i10 % 10]);
                i10 /= 10;
            }
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.insert(0, 'm');
            }
            return sb2.toString();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.currentPage < this.numPages) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public String next() {
            if (hasNext()) {
                StringBuilder sb2 = new StringBuilder();
                if (this.labelInfo.getPrefix() != null) {
                    String prefix = this.labelInfo.getPrefix();
                    while (prefix.lastIndexOf(0) != -1) {
                        prefix = prefix.substring(0, prefix.length() - 1);
                    }
                    sb2.append(prefix);
                }
                if (this.labelInfo.getStyle() != null) {
                    sb2.append(getNumber(this.labelInfo.getStart() + this.currentPage, this.labelInfo.getStyle()));
                }
                this.currentPage++;
                return sb2.toString();
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    public interface LabelHandler {
        void newLabel(int i10, String str);
    }

    public PDPageLabels(PDDocument pDDocument) {
        this.labels = new TreeMap();
        this.doc = pDDocument;
        PDPageLabelRange pDPageLabelRange = new PDPageLabelRange();
        pDPageLabelRange.setStyle("D");
        this.labels.put(0, pDPageLabelRange);
    }

    private void computeLabels(LabelHandler labelHandler) {
        Iterator<Map.Entry<Integer, PDPageLabelRange>> it = this.labels.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry<Integer, PDPageLabelRange> next = it.next();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry<Integer, PDPageLabelRange> next2 = it.next();
            LabelGenerator labelGenerator = new LabelGenerator(next.getValue(), next2.getKey().intValue() - next.getKey().intValue());
            while (labelGenerator.hasNext()) {
                labelHandler.newLabel(i10, labelGenerator.next());
                i10++;
            }
            next = next2;
        }
        LabelGenerator labelGenerator2 = new LabelGenerator(next.getValue(), this.doc.getNumberOfPages() - next.getKey().intValue());
        while (labelGenerator2.hasNext()) {
            labelHandler.newLabel(i10, labelGenerator2.next());
            i10++;
        }
    }

    private void findLabels(PDNumberTreeNode pDNumberTreeNode) {
        List<PDNumberTreeNode> kids = pDNumberTreeNode.getKids();
        if (pDNumberTreeNode.getKids() != null) {
            for (PDNumberTreeNode pDNumberTreeNode2 : kids) {
                findLabels(pDNumberTreeNode2);
            }
            return;
        }
        Map<Integer, COSObjectable> numbers = pDNumberTreeNode.getNumbers();
        if (numbers != null) {
            for (Map.Entry<Integer, COSObjectable> entry : numbers.entrySet()) {
                if (entry.getKey().intValue() >= 0) {
                    this.labels.put(entry.getKey(), (PDPageLabelRange) entry.getValue());
                }
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        COSDictionary cOSDictionary = new COSDictionary();
        COSArray cOSArray = new COSArray();
        for (Map.Entry<Integer, PDPageLabelRange> entry : this.labels.entrySet()) {
            cOSArray.add((COSBase) COSInteger.get(entry.getKey().intValue()));
            cOSArray.add(entry.getValue());
        }
        cOSDictionary.setItem(COSName.NUMS, (COSBase) cOSArray);
        return cOSDictionary;
    }

    public String[] getLabelsByPageIndices() {
        final int numberOfPages = this.doc.getNumberOfPages();
        final String[] strArr = new String[numberOfPages];
        computeLabels(new LabelHandler() { // from class: com.tom_roush.pdfbox.pdmodel.common.PDPageLabels.2
            @Override // com.tom_roush.pdfbox.pdmodel.common.PDPageLabels.LabelHandler
            public void newLabel(int i10, String str) {
                if (i10 < numberOfPages) {
                    strArr[i10] = str;
                }
            }
        });
        return strArr;
    }

    public NavigableSet<Integer> getPageIndices() {
        return new TreeSet(this.labels.keySet());
    }

    public Map<String, Integer> getPageIndicesByLabels() {
        final HashMap hashMap = new HashMap(this.doc.getNumberOfPages());
        computeLabels(new LabelHandler() { // from class: com.tom_roush.pdfbox.pdmodel.common.PDPageLabels.1
            @Override // com.tom_roush.pdfbox.pdmodel.common.PDPageLabels.LabelHandler
            public void newLabel(int i10, String str) {
                hashMap.put(str, Integer.valueOf(i10));
            }
        });
        return hashMap;
    }

    public PDPageLabelRange getPageLabelRange(int i10) {
        return this.labels.get(Integer.valueOf(i10));
    }

    public int getPageRangeCount() {
        return this.labels.size();
    }

    public void setLabelItem(int i10, PDPageLabelRange pDPageLabelRange) {
        if (i10 >= 0) {
            this.labels.put(Integer.valueOf(i10), pDPageLabelRange);
            return;
        }
        throw new IllegalArgumentException("startPage parameter of setLabelItem may not be < 0");
    }

    public PDPageLabels(PDDocument pDDocument, COSDictionary cOSDictionary) {
        this(pDDocument);
        if (cOSDictionary == null) {
            return;
        }
        findLabels(new PDNumberTreeNode(cOSDictionary, PDPageLabelRange.class));
    }
}
