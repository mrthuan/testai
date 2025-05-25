package lib.zj.office.fc.poifs.crypt;

import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.DocumentInputStream;
import lib.zj.office.fc.poifs.filesystem.NPOIFSFileSystem;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;

/* loaded from: classes3.dex */
public class EncryptionInfo {
    private final int encryptionFlags;
    private final EncryptionHeader header;
    private final EncryptionVerifier verifier;
    private final int versionMajor;
    private final int versionMinor;

    public EncryptionInfo(POIFSFileSystem pOIFSFileSystem) {
        this(pOIFSFileSystem.getRoot());
    }

    public int getEncryptionFlags() {
        return this.encryptionFlags;
    }

    public EncryptionHeader getHeader() {
        return this.header;
    }

    public EncryptionVerifier getVerifier() {
        return this.verifier;
    }

    public int getVersionMajor() {
        return this.versionMajor;
    }

    public int getVersionMinor() {
        return this.versionMinor;
    }

    public EncryptionInfo(NPOIFSFileSystem nPOIFSFileSystem) {
        this(nPOIFSFileSystem.getRoot());
    }

    public EncryptionInfo(DirectoryNode directoryNode) {
        DocumentInputStream createDocumentInputStream = directoryNode.createDocumentInputStream("EncryptionInfo");
        short readShort = createDocumentInputStream.readShort();
        this.versionMajor = readShort;
        short readShort2 = createDocumentInputStream.readShort();
        this.versionMinor = readShort2;
        int readInt = createDocumentInputStream.readInt();
        this.encryptionFlags = readInt;
        if (readShort == 4 && readShort2 == 4 && readInt == 64) {
            StringBuilder sb2 = new StringBuilder();
            int available = createDocumentInputStream.available();
            byte[] bArr = new byte[available];
            createDocumentInputStream.read(bArr);
            for (int i10 = 0; i10 < available; i10++) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            this.header = new EncryptionHeader(sb3);
            this.verifier = new EncryptionVerifier(sb3);
            return;
        }
        createDocumentInputStream.readInt();
        EncryptionHeader encryptionHeader = new EncryptionHeader(createDocumentInputStream);
        this.header = encryptionHeader;
        if (encryptionHeader.getAlgorithm() == 26625) {
            this.verifier = new EncryptionVerifier(createDocumentInputStream, 20);
        } else {
            this.verifier = new EncryptionVerifier(createDocumentInputStream, 32);
        }
    }
}
