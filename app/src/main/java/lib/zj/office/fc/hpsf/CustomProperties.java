package lib.zj.office.fc.hpsf;

import b.a;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class CustomProperties extends HashMap<Object, CustomProperty> {
    private Map<Long, String> dictionaryIDToName = new HashMap();
    private Map<String, Long> dictionaryNameToID = new HashMap();
    private boolean isPure = true;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof Long) {
            return super.containsKey((Long) obj);
        }
        if (obj instanceof String) {
            return super.containsKey(this.dictionaryNameToID.get(obj));
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj instanceof CustomProperty) {
            return super.containsValue((CustomProperty) obj);
        }
        for (CustomProperty customProperty : super.values()) {
            if (customProperty.getValue() == obj) {
                return true;
            }
        }
        return false;
    }

    public Object get(String str) {
        CustomProperty customProperty = (CustomProperty) super.get(this.dictionaryNameToID.get(str));
        if (customProperty != null) {
            return customProperty.getValue();
        }
        return null;
    }

    public int getCodepage() {
        Iterator<CustomProperty> it = values().iterator();
        int i10 = -1;
        while (i10 == -1 && it.hasNext()) {
            CustomProperty next = it.next();
            if (next.getID() == 1) {
                i10 = ((Integer) next.getValue()).intValue();
            }
        }
        return i10;
    }

    public Map<Long, String> getDictionary() {
        return this.dictionaryIDToName;
    }

    public Set<String> idSet() {
        return this.dictionaryNameToID.keySet();
    }

    public boolean isPure() {
        return this.isPure;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.dictionaryNameToID.keySet();
    }

    public Set<String> nameSet() {
        return this.dictionaryNameToID.keySet();
    }

    public CustomProperty put(String str, CustomProperty customProperty) {
        if (str == null) {
            this.isPure = false;
            return null;
        } else if (str.equals(customProperty.getName())) {
            Long valueOf = Long.valueOf(customProperty.getID());
            Long l10 = this.dictionaryNameToID.get(str);
            this.dictionaryIDToName.remove(l10);
            this.dictionaryNameToID.put(str, valueOf);
            this.dictionaryIDToName.put(valueOf, str);
            CustomProperty customProperty2 = (CustomProperty) super.remove(l10);
            super.put((CustomProperties) valueOf, (Long) customProperty);
            return customProperty2;
        } else {
            StringBuilder g10 = a.g("Parameter \"name\" (", str, ") and custom property's name (");
            g10.append(customProperty.getName());
            g10.append(") do not match.");
            throw new IllegalArgumentException(g10.toString());
        }
    }

    public Object remove(String str) {
        Long l10 = this.dictionaryNameToID.get(str);
        if (l10 == null) {
            return null;
        }
        this.dictionaryIDToName.remove(l10);
        this.dictionaryNameToID.remove(str);
        return super.remove(l10);
    }

    public void setCodepage(int i10) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(1L);
        mutableProperty.setType(2L);
        mutableProperty.setValue(Integer.valueOf(i10));
        put(new CustomProperty(mutableProperty));
    }

    public void setPure(boolean z10) {
        this.isPure = z10;
    }

    private Object put(CustomProperty customProperty) {
        String name = customProperty.getName();
        Long l10 = this.dictionaryNameToID.get(name);
        if (l10 != null) {
            customProperty.setID(l10.longValue());
        } else {
            long j10 = 1;
            for (Long l11 : this.dictionaryIDToName.keySet()) {
                long longValue = l11.longValue();
                if (longValue > j10) {
                    j10 = longValue;
                }
            }
            customProperty.setID(j10 + 1);
        }
        return put(name, customProperty);
    }

    public Object put(String str, String str2) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(-1L);
        mutableProperty.setType(31L);
        mutableProperty.setValue(str2);
        return put(new CustomProperty(mutableProperty, str));
    }

    public Object put(String str, Long l10) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(-1L);
        mutableProperty.setType(20L);
        mutableProperty.setValue(l10);
        return put(new CustomProperty(mutableProperty, str));
    }

    public Object put(String str, Double d10) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(-1L);
        mutableProperty.setType(5L);
        mutableProperty.setValue(d10);
        return put(new CustomProperty(mutableProperty, str));
    }

    public Object put(String str, Integer num) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(-1L);
        mutableProperty.setType(3L);
        mutableProperty.setValue(num);
        return put(new CustomProperty(mutableProperty, str));
    }

    public Object put(String str, Boolean bool) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(-1L);
        mutableProperty.setType(11L);
        mutableProperty.setValue(bool);
        return put(new CustomProperty(mutableProperty, str));
    }

    public Object put(String str, Date date) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(-1L);
        mutableProperty.setType(64L);
        mutableProperty.setValue(date);
        return put(new CustomProperty(mutableProperty, str));
    }
}
