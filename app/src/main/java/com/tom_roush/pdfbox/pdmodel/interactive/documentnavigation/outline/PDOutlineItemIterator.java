package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
class PDOutlineItemIterator implements Iterator<PDOutlineItem> {
    private PDOutlineItem currentItem;
    private final PDOutlineItem startingItem;

    public PDOutlineItemIterator(PDOutlineItem pDOutlineItem) {
        this.startingItem = pDOutlineItem;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        PDOutlineItem pDOutlineItem;
        if (this.startingItem != null && ((pDOutlineItem = this.currentItem) == null || (pDOutlineItem.getNextSibling() != null && !this.startingItem.equals(this.currentItem.getNextSibling())))) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PDOutlineItem next() {
        if (hasNext()) {
            PDOutlineItem pDOutlineItem = this.currentItem;
            if (pDOutlineItem == null) {
                this.currentItem = this.startingItem;
            } else {
                this.currentItem = pDOutlineItem.getNextSibling();
            }
            return this.currentItem;
        }
        throw new NoSuchElementException();
    }
}
