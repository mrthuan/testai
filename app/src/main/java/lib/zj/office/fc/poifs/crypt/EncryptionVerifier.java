package lib.zj.office.fc.poifs.crypt;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import lib.zj.office.fc.EncryptedDocumentException;
import lib.zj.office.fc.codec.Base64;
import lib.zj.office.fc.poifs.filesystem.DocumentInputStream;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes3.dex */
public class EncryptionVerifier {
    private final int algorithm;
    private final int cipherMode;
    private final byte[] encryptedKey;
    private final byte[] salt;
    private final int spinCount;
    private final byte[] verifier;
    private final byte[] verifierHash;
    private final int verifierHashSize;

    public EncryptionVerifier(String str) {
        NamedNodeMap namedNodeMap;
        try {
            int i10 = 0;
            NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes())).getElementsByTagName("keyEncryptor").item(0).getChildNodes();
            while (true) {
                if (i10 >= childNodes.getLength()) {
                    namedNodeMap = null;
                    break;
                }
                Node item = childNodes.item(i10);
                if (item.getNodeName().equals("p:encryptedKey")) {
                    namedNodeMap = item.getAttributes();
                    break;
                }
                i10++;
            }
            if (namedNodeMap != null) {
                this.spinCount = Integer.parseInt(namedNodeMap.getNamedItem("spinCount").getNodeValue());
                this.verifier = Base64.decodeBase64(namedNodeMap.getNamedItem("encryptedVerifierHashInput").getNodeValue().getBytes());
                byte[] decodeBase64 = Base64.decodeBase64(namedNodeMap.getNamedItem("saltValue").getNodeValue().getBytes());
                this.salt = decodeBase64;
                this.encryptedKey = Base64.decodeBase64(namedNodeMap.getNamedItem("encryptedKeyValue").getNodeValue().getBytes());
                if (Integer.parseInt(namedNodeMap.getNamedItem("saltSize").getNodeValue()) == decodeBase64.length) {
                    this.verifierHash = Base64.decodeBase64(namedNodeMap.getNamedItem("encryptedVerifierHashValue").getNodeValue().getBytes());
                    int parseInt = Integer.parseInt(namedNodeMap.getNamedItem("blockSize").getNodeValue());
                    if ("AES".equals(namedNodeMap.getNamedItem("cipherAlgorithm").getNodeValue())) {
                        if (parseInt == 16) {
                            this.algorithm = EncryptionHeader.ALGORITHM_AES_128;
                        } else if (parseInt == 24) {
                            this.algorithm = EncryptionHeader.ALGORITHM_AES_192;
                        } else if (parseInt == 32) {
                            this.algorithm = EncryptionHeader.ALGORITHM_AES_256;
                        } else {
                            throw new EncryptedDocumentException("Unsupported block size");
                        }
                        String nodeValue = namedNodeMap.getNamedItem("cipherChaining").getNodeValue();
                        if ("ChainingModeCBC".equals(nodeValue)) {
                            this.cipherMode = 2;
                        } else if ("ChainingModeCFB".equals(nodeValue)) {
                            this.cipherMode = 3;
                        } else {
                            throw new EncryptedDocumentException("Unsupported chaining mode");
                        }
                        this.verifierHashSize = Integer.parseInt(namedNodeMap.getNamedItem("hashSize").getNodeValue());
                        return;
                    }
                    throw new EncryptedDocumentException("Unsupported cipher");
                }
                throw new EncryptedDocumentException("Cannot process encrypted office files!");
            }
            throw new EncryptedDocumentException("Cannot process encrypted office files!");
        } catch (Exception unused) {
            throw new EncryptedDocumentException("Unable to parse keyEncryptor");
        }
    }

    public int getAlgorithm() {
        return this.algorithm;
    }

    public int getCipherMode() {
        return this.cipherMode;
    }

    public byte[] getEncryptedKey() {
        return this.encryptedKey;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public int getSpinCount() {
        return this.spinCount;
    }

    public byte[] getVerifier() {
        return this.verifier;
    }

    public byte[] getVerifierHash() {
        return this.verifierHash;
    }

    public EncryptionVerifier(DocumentInputStream documentInputStream, int i10) {
        if (documentInputStream.readInt() == 16) {
            byte[] bArr = new byte[16];
            this.salt = bArr;
            documentInputStream.readFully(bArr);
            byte[] bArr2 = new byte[16];
            this.verifier = bArr2;
            documentInputStream.readFully(bArr2);
            this.verifierHashSize = documentInputStream.readInt();
            byte[] bArr3 = new byte[i10];
            this.verifierHash = bArr3;
            documentInputStream.readFully(bArr3);
            this.spinCount = 50000;
            this.algorithm = EncryptionHeader.ALGORITHM_AES_128;
            this.cipherMode = 1;
            this.encryptedKey = null;
            return;
        }
        throw new RuntimeException("Salt size != 16 !?");
    }
}
