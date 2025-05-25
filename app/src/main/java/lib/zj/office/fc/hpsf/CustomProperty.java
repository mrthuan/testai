package lib.zj.office.fc.hpsf;

/* loaded from: classes3.dex */
public class CustomProperty extends MutableProperty {
    private String name;

    public CustomProperty() {
        this.name = null;
    }

    public boolean equalsContents(Object obj) {
        boolean equals;
        CustomProperty customProperty = (CustomProperty) obj;
        String name = customProperty.getName();
        String name2 = getName();
        if (name == null) {
            if (name2 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = name.equals(name2);
        }
        if (equals && customProperty.getID() == getID() && customProperty.getType() == getType() && customProperty.getValue().equals(getValue())) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    @Override // lib.zj.office.fc.hpsf.Property
    public int hashCode() {
        return (int) getID();
    }

    public void setName(String str) {
        this.name = str;
    }

    public CustomProperty(Property property) {
        this(property, null);
    }

    public CustomProperty(Property property, String str) {
        super(property);
        this.name = str;
    }
}
