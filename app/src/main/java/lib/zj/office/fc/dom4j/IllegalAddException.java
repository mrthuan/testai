package lib.zj.office.fc.dom4j;

/* loaded from: classes3.dex */
public class IllegalAddException extends IllegalArgumentException {
    public IllegalAddException(String str) {
        super(str);
    }

    public IllegalAddException(Element element, Node node, String str) {
        super("The node \"" + node.toString() + "\" could not be added to the element \"" + element.getQualifiedName() + "\" because: " + str);
    }

    public IllegalAddException(Branch branch, Node node, String str) {
        super("The node \"" + node.toString() + "\" could not be added to the branch \"" + branch.getName() + "\" because: " + str);
    }
}
