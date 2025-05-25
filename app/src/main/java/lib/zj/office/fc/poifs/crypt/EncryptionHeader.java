package lib.zj.office.fc.poifs.crypt;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import lib.zj.office.fc.EncryptedDocumentException;
import lib.zj.office.fc.codec.Base64;
import lib.zj.office.fc.poifs.filesystem.DocumentInputStream;
import org.w3c.dom.NamedNodeMap;

/* loaded from: classes3.dex */
public class EncryptionHeader {
    public static final int ALGORITHM_AES_128 = 26126;
    public static final int ALGORITHM_AES_192 = 26127;
    public static final int ALGORITHM_AES_256 = 26128;
    public static final int ALGORITHM_RC4 = 26625;
    public static final int HASH_SHA1 = 32772;
    public static final int MODE_CBC = 2;
    public static final int MODE_CFB = 3;
    public static final int MODE_ECB = 1;
    public static final int PROVIDER_AES = 24;
    public static final int PROVIDER_RC4 = 1;
    private final int algorithm;
    private final int cipherMode;
    private final String cspName;
    private final int flags;
    private final int hashAlgorithm;
    private final byte[] keySalt;
    private final int keySize;
    private final int providerType;
    private final int sizeExtra;

    public EncryptionHeader(DocumentInputStream documentInputStream) {
        this.flags = documentInputStream.readInt();
        this.sizeExtra = documentInputStream.readInt();
        this.algorithm = documentInputStream.readInt();
        this.hashAlgorithm = documentInputStream.readInt();
        this.keySize = documentInputStream.readInt();
        this.providerType = documentInputStream.readInt();
        documentInputStream.readLong();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char readShort = (char) documentInputStream.readShort();
            if (readShort == 0) {
                this.cspName = sb2.toString();
                this.cipherMode = 1;
                this.keySalt = null;
                return;
            }
            sb2.append(readShort);
        }
    }

    public int getAlgorithm() {
        return this.algorithm;
    }

    public int getCipherMode() {
        return this.cipherMode;
    }

    public String getCspName() {
        return this.cspName;
    }

    public int getFlags() {
        return this.flags;
    }

    public int getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public byte[] getKeySalt() {
        return this.keySalt;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getProviderType() {
        return this.providerType;
    }

    public int getSizeExtra() {
        return this.sizeExtra;
    }

    public EncryptionHeader(String str) {
        try {
            NamedNodeMap attributes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes())).getElementsByTagName("keyData").item(0).getAttributes();
            this.keySize = Integer.parseInt(attributes.getNamedItem("keyBits").getNodeValue());
            this.flags = 0;
            this.sizeExtra = 0;
            this.cspName = null;
            int parseInt = Integer.parseInt(attributes.getNamedItem("blockSize").getNodeValue());
            if ("AES".equals(attributes.getNamedItem("cipherAlgorithm").getNodeValue())) {
                this.providerType = 24;
                if (parseInt == 16) {
                    this.algorithm = ALGORITHM_AES_128;
                } else if (parseInt == 24) {
                    this.algorithm = ALGORITHM_AES_192;
                } else if (parseInt == 32) {
                    this.algorithm = ALGORITHM_AES_256;
                } else {
                    throw new EncryptedDocumentException("Unsupported key length");
                }
                String nodeValue = attributes.getNamedItem("cipherChaining").getNodeValue();
                if ("ChainingModeCBC".equals(nodeValue)) {
                    this.cipherMode = 2;
                } else if ("ChainingModeCFB".equals(nodeValue)) {
                    this.cipherMode = 3;
                } else {
                    throw new EncryptedDocumentException("Unsupported chaining mode");
                }
                String nodeValue2 = attributes.getNamedItem("hashAlgorithm").getNodeValue();
                int parseInt2 = Integer.parseInt(attributes.getNamedItem("hashSize").getNodeValue());
                if ("SHA1".equals(nodeValue2) && parseInt2 == 20) {
                    this.hashAlgorithm = HASH_SHA1;
                    String nodeValue3 = attributes.getNamedItem("saltValue").getNodeValue();
                    int parseInt3 = Integer.parseInt(attributes.getNamedItem("saltSize").getNodeValue());
                    byte[] decodeBase64 = Base64.decodeBase64(nodeValue3.getBytes());
                    this.keySalt = decodeBase64;
                    if (decodeBase64.length != parseInt3) {
                        throw new EncryptedDocumentException("Invalid salt length");
                    }
                    return;
                }
                throw new EncryptedDocumentException("Unsupported hash algorithm");
            }
            throw new EncryptedDocumentException("Unsupported cipher");
        } catch (Exception unused) {
            throw new EncryptedDocumentException("Cannot process encrypted office files!");
        }
    }
}
