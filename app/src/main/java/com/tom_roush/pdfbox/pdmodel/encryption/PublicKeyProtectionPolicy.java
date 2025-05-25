package com.tom_roush.pdfbox.pdmodel.encryption;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class PublicKeyProtectionPolicy extends ProtectionPolicy {
    private X509Certificate decryptionCertificate;
    private final List<PublicKeyRecipient> recipients = new ArrayList();

    public void addRecipient(PublicKeyRecipient publicKeyRecipient) {
        this.recipients.add(publicKeyRecipient);
    }

    public X509Certificate getDecryptionCertificate() {
        return this.decryptionCertificate;
    }

    public int getNumberOfRecipients() {
        return this.recipients.size();
    }

    public Iterator<PublicKeyRecipient> getRecipientsIterator() {
        return this.recipients.iterator();
    }

    public boolean removeRecipient(PublicKeyRecipient publicKeyRecipient) {
        return this.recipients.remove(publicKeyRecipient);
    }

    public void setDecryptionCertificate(X509Certificate x509Certificate) {
        this.decryptionCertificate = x509Certificate;
    }
}
