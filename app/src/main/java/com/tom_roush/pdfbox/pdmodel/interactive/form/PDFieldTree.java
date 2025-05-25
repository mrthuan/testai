package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSDictionary;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDFieldTree implements Iterable<PDField> {
    private final PDAcroForm acroForm;

    /* loaded from: classes2.dex */
    public static final class FieldIterator implements Iterator<PDField> {
        private final Queue<PDField> queue;
        private final Set<COSDictionary> set;

        public /* synthetic */ FieldIterator(PDAcroForm pDAcroForm, int i10) {
            this(pDAcroForm);
        }

        private void enqueueKids(PDField pDField) {
            this.queue.add(pDField);
            this.set.add(pDField.getCOSObject());
            if (pDField instanceof PDNonTerminalField) {
                for (PDField pDField2 : ((PDNonTerminalField) pDField).getChildren()) {
                    if (this.set.contains(pDField2.getCOSObject())) {
                        pDField.getFullyQualifiedName();
                    } else {
                        enqueueKids(pDField2);
                    }
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private FieldIterator(PDAcroForm pDAcroForm) {
            this.queue = new ArrayDeque();
            this.set = Collections.newSetFromMap(new IdentityHashMap());
            for (PDField pDField : pDAcroForm.getFields()) {
                enqueueKids(pDField);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public PDField next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }
    }

    public PDFieldTree(PDAcroForm pDAcroForm) {
        if (pDAcroForm != null) {
            this.acroForm = pDAcroForm;
            return;
        }
        throw new IllegalArgumentException("root cannot be null");
    }

    @Override // java.lang.Iterable
    public Iterator<PDField> iterator() {
        return new FieldIterator(this.acroForm, 0);
    }
}
