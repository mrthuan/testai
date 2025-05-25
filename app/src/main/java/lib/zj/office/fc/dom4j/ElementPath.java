package lib.zj.office.fc.dom4j;

/* loaded from: classes3.dex */
public interface ElementPath {
    void addHandler(String str, ElementHandler elementHandler);

    Element getCurrent();

    Element getElement(int i10);

    String getPath();

    void removeHandler(String str);

    int size();
}
