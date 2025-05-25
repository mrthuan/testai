package lib.zj.office.fc.dom4j.jaxb;

/* loaded from: classes3.dex */
abstract class JAXBSupport {
    private ClassLoader classloader;
    private String contextPath;

    public JAXBSupport(String str) {
        this.contextPath = str;
    }

    public JAXBSupport(String str, ClassLoader classLoader) {
        this.contextPath = str;
        this.classloader = classLoader;
    }
}
