package lib.zj.office.fc.hwpf;

import java.io.InputStream;
import java.io.PushbackInputStream;
import lib.zj.office.fc.EncryptedDocumentException;
import lib.zj.office.fc.fs.filesystem.CFBFileSystem;
import lib.zj.office.fc.hwpf.model.CHPBinTable;
import lib.zj.office.fc.hwpf.model.FileInformationBlock;
import lib.zj.office.fc.hwpf.model.FontTable;
import lib.zj.office.fc.hwpf.model.ListTables;
import lib.zj.office.fc.hwpf.model.PAPBinTable;
import lib.zj.office.fc.hwpf.model.SectionTable;
import lib.zj.office.fc.hwpf.model.StyleSheet;
import lib.zj.office.fc.hwpf.model.TextPieceTable;
import lib.zj.office.fc.hwpf.usermodel.ObjectPoolImpl;
import lib.zj.office.fc.hwpf.usermodel.ObjectsPool;
import lib.zj.office.fc.hwpf.usermodel.Range;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public abstract class HWPFDocumentCore {
    protected static final String STREAM_OBJECT_POOL = "ObjectPool";
    protected static final String STREAM_WORD_DOCUMENT = "WordDocument";
    protected CHPBinTable _cbt;
    protected FileInformationBlock _fib;
    protected FontTable _ft;
    protected ListTables _lt;
    protected byte[] _mainStream;
    protected ObjectPoolImpl _objectPool;
    protected PAPBinTable _pbt;
    protected StyleSheet _ss;
    protected SectionTable _st;
    protected CFBFileSystem cfbFS;

    public HWPFDocumentCore(InputStream inputStream, f fVar) {
        CFBFileSystem verifyAndBuildPOIFS = verifyAndBuildPOIFS(inputStream, fVar);
        this.cfbFS = verifyAndBuildPOIFS;
        this._mainStream = verifyAndBuildPOIFS.getPropertyRawData(STREAM_WORD_DOCUMENT);
        FileInformationBlock fileInformationBlock = new FileInformationBlock(this._mainStream);
        this._fib = fileInformationBlock;
        if (!fileInformationBlock.isFEncrypted()) {
            return;
        }
        throw new EncryptedDocumentException("Cannot process encrypted office files!");
    }

    public static CFBFileSystem verifyAndBuildPOIFS(InputStream inputStream, f fVar) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 6);
        byte[] bArr = new byte[6];
        pushbackInputStream.read(bArr);
        if (bArr[0] == 123 && bArr[1] == 92 && bArr[2] == 114 && bArr[3] == 116 && bArr[4] == 102) {
            throw new IllegalArgumentException("The document is really a RTF file");
        }
        pushbackInputStream.unread(bArr);
        return new CFBFileSystem(pushbackInputStream, fVar);
    }

    public CHPBinTable getCharacterTable() {
        return this._cbt;
    }

    public String getDocumentText() {
        return getText().toString();
    }

    public FileInformationBlock getFileInformationBlock() {
        return this._fib;
    }

    public FontTable getFontTable() {
        return this._ft;
    }

    public ListTables getListTables() {
        return this._lt;
    }

    public ObjectsPool getObjectsPool() {
        return this._objectPool;
    }

    public abstract Range getOverallRange();

    public PAPBinTable getParagraphTable() {
        return this._pbt;
    }

    public abstract Range getRange();

    public SectionTable getSectionTable() {
        return this._st;
    }

    public StyleSheet getStyleSheet() {
        return this._ss;
    }

    @Internal
    public abstract StringBuilder getText();

    public abstract TextPieceTable getTextTable();
}
