package lib.zj.office.fc.poifs.property;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import lib.zj.office.fc.poifs.filesystem.BATManaged;
import lib.zj.office.fc.poifs.storage.HeaderBlock;

/* loaded from: classes3.dex */
public abstract class PropertyTableBase implements BATManaged {
    private final HeaderBlock _header_block;
    protected final List<Property> _properties;

    public PropertyTableBase(HeaderBlock headerBlock) {
        this._header_block = headerBlock;
        this._properties = new ArrayList();
        addProperty(new RootProperty());
    }

    private void populatePropertyTree(DirectoryProperty directoryProperty) {
        int childIndex = directoryProperty.getChildIndex();
        if (!Property.isValidIndex(childIndex)) {
            return;
        }
        Stack stack = new Stack();
        stack.push(this._properties.get(childIndex));
        while (!stack.empty()) {
            Property property = (Property) stack.pop();
            directoryProperty.addChild(property);
            if (property.isDirectory()) {
                populatePropertyTree((DirectoryProperty) property);
            }
            int previousChildIndex = property.getPreviousChildIndex();
            if (Property.isValidIndex(previousChildIndex)) {
                stack.push(this._properties.get(previousChildIndex));
            }
            int nextChildIndex = property.getNextChildIndex();
            if (Property.isValidIndex(nextChildIndex)) {
                stack.push(this._properties.get(nextChildIndex));
            }
        }
    }

    public void addProperty(Property property) {
        this._properties.add(property);
    }

    public RootProperty getRoot() {
        return (RootProperty) this._properties.get(0);
    }

    public int getStartBlock() {
        return this._header_block.getPropertyStart();
    }

    public void removeProperty(Property property) {
        this._properties.remove(property);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public void setStartBlock(int i10) {
        this._header_block.setPropertyStart(i10);
    }

    public PropertyTableBase(HeaderBlock headerBlock, List<Property> list) {
        this._header_block = headerBlock;
        this._properties = list;
        populatePropertyTree((DirectoryProperty) list.get(0));
    }
}
