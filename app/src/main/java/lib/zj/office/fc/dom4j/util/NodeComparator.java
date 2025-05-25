package lib.zj.office.fc.dom4j.util;

import java.util.Comparator;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.Branch;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.CharacterData;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentType;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.Text;

/* loaded from: classes3.dex */
public class NodeComparator implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        if (obj instanceof Node) {
            if (obj2 instanceof Node) {
                return compare((Node) obj, (Node) obj2);
            }
            return 1;
        } else if (obj2 instanceof Node) {
            return -1;
        } else {
            if (obj instanceof Comparable) {
                return ((Comparable) obj).compareTo(obj2);
            }
            return obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    public int compareContent(Branch branch, Branch branch2) {
        int nodeCount = branch.nodeCount();
        int nodeCount2 = nodeCount - branch2.nodeCount();
        if (nodeCount2 == 0) {
            for (int i10 = 0; i10 < nodeCount; i10++) {
                nodeCount2 = compare(branch.node(i10), branch2.node(i10));
                if (nodeCount2 != 0) {
                    break;
                }
            }
        }
        return nodeCount2;
    }

    public int compare(Node node, Node node2) {
        short nodeType = node.getNodeType();
        int nodeType2 = nodeType - node2.getNodeType();
        if (nodeType2 != 0) {
            return nodeType2;
        }
        switch (nodeType) {
            case 1:
                return compare((Element) node, (Element) node2);
            case 2:
                return compare((Attribute) node, (Attribute) node2);
            case 3:
                return compare((CharacterData) ((Text) node), (CharacterData) ((Text) node2));
            case 4:
                return compare((CharacterData) ((CDATA) node), (CharacterData) ((CDATA) node2));
            case 5:
                return compare((Entity) node, (Entity) node2);
            case 6:
            case 11:
            case 12:
            default:
                throw new RuntimeException("Invalid node types. node1: " + node + " and node2: " + node2);
            case 7:
                return compare((ProcessingInstruction) node, (ProcessingInstruction) node2);
            case 8:
                return compare((CharacterData) ((Comment) node), (CharacterData) ((Comment) node2));
            case 9:
                return compare((Document) node, (Document) node2);
            case 10:
                return compare((DocumentType) node, (DocumentType) node2);
            case 13:
                return compare((Namespace) node, (Namespace) node2);
        }
    }

    public int compare(Document document, Document document2) {
        int compare = compare(document.getDocType(), document2.getDocType());
        return compare == 0 ? compareContent(document, document2) : compare;
    }

    public int compare(Element element, Element element2) {
        int compare = compare(element.getQName(), element2.getQName());
        if (compare == 0) {
            int attributeCount = element.attributeCount();
            int attributeCount2 = attributeCount - element2.attributeCount();
            if (attributeCount2 == 0) {
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    Attribute attribute = element.attribute(i10);
                    int compare2 = compare(attribute, element2.attribute(attribute.getQName()));
                    if (compare2 != 0) {
                        return compare2;
                    }
                }
                return compareContent(element, element2);
            }
            return attributeCount2;
        }
        return compare;
    }

    public int compare(Attribute attribute, Attribute attribute2) {
        int compare = compare(attribute.getQName(), attribute2.getQName());
        return compare == 0 ? compare(attribute.getValue(), attribute2.getValue()) : compare;
    }

    public int compare(QName qName, QName qName2) {
        int compare = compare(qName.getNamespaceURI(), qName2.getNamespaceURI());
        return compare == 0 ? compare(qName.getQualifiedName(), qName2.getQualifiedName()) : compare;
    }

    public int compare(Namespace namespace, Namespace namespace2) {
        int compare = compare(namespace.getURI(), namespace2.getURI());
        return compare == 0 ? compare(namespace.getPrefix(), namespace2.getPrefix()) : compare;
    }

    public int compare(CharacterData characterData, CharacterData characterData2) {
        return compare(characterData.getText(), characterData2.getText());
    }

    public int compare(DocumentType documentType, DocumentType documentType2) {
        if (documentType == documentType2) {
            return 0;
        }
        if (documentType == null) {
            return -1;
        }
        if (documentType2 == null) {
            return 1;
        }
        int compare = compare(documentType.getPublicID(), documentType2.getPublicID());
        if (compare == 0) {
            int compare2 = compare(documentType.getSystemID(), documentType2.getSystemID());
            return compare2 == 0 ? compare(documentType.getName(), documentType2.getName()) : compare2;
        }
        return compare;
    }

    public int compare(Entity entity, Entity entity2) {
        int compare = compare(entity.getName(), entity2.getName());
        return compare == 0 ? compare(entity.getText(), entity2.getText()) : compare;
    }

    public int compare(ProcessingInstruction processingInstruction, ProcessingInstruction processingInstruction2) {
        int compare = compare(processingInstruction.getTarget(), processingInstruction2.getTarget());
        return compare == 0 ? compare(processingInstruction.getText(), processingInstruction2.getText()) : compare;
    }

    public int compare(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
