package lib.zj.office.fc.openxml4j.opc;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes3.dex */
public final class PackageRelationship {
    public static final String ID_ATTRIBUTE_NAME = "Id";
    public static final String RELATIONSHIPS_TAG_NAME = "Relationships";
    public static final String RELATIONSHIP_TAG_NAME = "Relationship";
    public static final String TARGET_ATTRIBUTE_NAME = "Target";
    public static final String TARGET_MODE_ATTRIBUTE_NAME = "TargetMode";
    public static final String TYPE_ATTRIBUTE_NAME = "Type";
    private static URI containerRelationshipPart;
    private ZipPackage container;

    /* renamed from: id  reason: collision with root package name */
    private String f20678id;
    private String relationshipType;
    private PackagePart source;
    private TargetMode targetMode;
    private URI targetUri;

    static {
        try {
            containerRelationshipPart = new URI("/_rels/.rels");
        } catch (URISyntaxException unused) {
        }
    }

    public PackageRelationship(ZipPackage zipPackage, PackagePart packagePart, URI uri, TargetMode targetMode, String str, String str2) {
        if (zipPackage != null) {
            if (uri != null) {
                if (str != null) {
                    if (str2 != null) {
                        this.container = zipPackage;
                        this.source = packagePart;
                        this.targetUri = uri;
                        this.targetMode = targetMode;
                        this.relationshipType = str;
                        this.f20678id = str2;
                        return;
                    }
                    throw new IllegalArgumentException(FacebookMediationAdapter.KEY_ID);
                }
                throw new IllegalArgumentException("relationshipType");
            }
            throw new IllegalArgumentException("targetUri");
        }
        throw new IllegalArgumentException("pkg");
    }

    public static URI getContainerPartRelationship() {
        return containerRelationshipPart;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PackageRelationship)) {
            return false;
        }
        PackageRelationship packageRelationship = (PackageRelationship) obj;
        if (!this.f20678id.equals(packageRelationship.f20678id) || !this.relationshipType.equals(packageRelationship.relationshipType)) {
            return false;
        }
        PackagePart packagePart = packageRelationship.source;
        if ((packagePart != null && !packagePart.equals(this.source)) || this.targetMode != packageRelationship.targetMode || !this.targetUri.equals(packageRelationship.targetUri)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f20678id;
    }

    public ZipPackage getPackage() {
        return this.container;
    }

    public String getRelationshipType() {
        return this.relationshipType;
    }

    public PackagePart getSource() {
        return this.source;
    }

    public URI getSourceURI() {
        PackagePart packagePart = this.source;
        if (packagePart == null) {
            return PackagingURIHelper.PACKAGE_ROOT_URI;
        }
        return packagePart._partName.getURI();
    }

    public TargetMode getTargetMode() {
        return this.targetMode;
    }

    public URI getTargetURI() {
        if (this.targetMode == TargetMode.EXTERNAL) {
            return this.targetUri;
        }
        if (!this.targetUri.toASCIIString().startsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
            return PackagingURIHelper.resolvePartUri(getSourceURI(), this.targetUri);
        }
        return this.targetUri;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.relationshipType.hashCode() + this.f20678id.hashCode();
        PackagePart packagePart = this.source;
        if (packagePart == null) {
            hashCode = 0;
        } else {
            hashCode = packagePart.hashCode();
        }
        return this.targetUri.hashCode() + this.targetMode.hashCode() + hashCode2 + hashCode;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        StringBuilder sb2 = new StringBuilder();
        if (this.f20678id == null) {
            str = "id=null";
        } else {
            str = "id=" + this.f20678id;
        }
        sb2.append(str);
        if (this.container == null) {
            str2 = " - container=null";
        } else {
            str2 = " - container=" + this.container.toString();
        }
        sb2.append(str2);
        if (this.relationshipType == null) {
            str3 = " - relationshipType=null";
        } else {
            str3 = " - relationshipType=" + this.relationshipType;
        }
        sb2.append(str3);
        if (this.source == null) {
            str4 = " - source=null";
        } else {
            str4 = " - source=" + getSourceURI().toASCIIString();
        }
        sb2.append(str4);
        if (this.targetUri == null) {
            str5 = " - target=null";
        } else {
            str5 = " - target=" + getTargetURI().toASCIIString();
        }
        sb2.append(str5);
        if (this.targetMode == null) {
            str6 = ",targetMode=null";
        } else {
            str6 = ",targetMode=" + this.targetMode.toString();
        }
        sb2.append(str6);
        return sb2.toString();
    }
}
