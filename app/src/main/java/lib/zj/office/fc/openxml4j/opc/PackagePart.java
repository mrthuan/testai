package lib.zj.office.fc.openxml4j.opc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.openxml4j.exceptions.InvalidOperationException;
import lib.zj.office.fc.openxml4j.opc.internal.ContentType;

/* loaded from: classes3.dex */
public abstract class PackagePart implements RelationshipSource {
    protected ZipPackage _container;
    protected ContentType _contentType;
    private boolean _isDeleted;
    private boolean _isRelationshipPart;
    protected PackagePartName _partName;
    private PackageRelationshipCollection _relationships;

    public PackagePart(ZipPackage zipPackage, PackagePartName packagePartName, ContentType contentType) {
        this(zipPackage, packagePartName, contentType, true);
    }

    private PackageRelationshipCollection getRelationshipsCore(String str) {
        if (this._relationships == null) {
            throwExceptionIfRelationship();
            this._relationships = new PackageRelationshipCollection(this);
        }
        return new PackageRelationshipCollection(this._relationships, str);
    }

    private void throwExceptionIfRelationship() {
        if (!this._isRelationshipPart) {
            return;
        }
        throw new InvalidOperationException("Can do this operation on a relationship part !");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addExternalRelationship(String str, String str2) {
        return addExternalRelationship(str, str2, null);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addRelationship(PackagePartName packagePartName, TargetMode targetMode, String str) {
        return addRelationship(packagePartName, targetMode, str, (String) null);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public void clearRelationships() {
        PackageRelationshipCollection packageRelationshipCollection = this._relationships;
        if (packageRelationshipCollection != null) {
            packageRelationshipCollection.clear();
        }
    }

    public abstract void close();

    public abstract void flush();

    public String getContentType() {
        return this._contentType.toString();
    }

    public InputStream getInputStream() {
        InputStream inputStreamImpl = getInputStreamImpl();
        if (inputStreamImpl != null) {
            return inputStreamImpl;
        }
        throw new IOException("Can't obtain the input stream from " + this._partName.getName());
    }

    public abstract InputStream getInputStreamImpl();

    public OutputStream getOutputStream() {
        if (this instanceof ZipPackagePart) {
            this._container.removePart(this._partName);
            PackagePart createPart = this._container.createPart(this._partName, this._contentType.toString(), false);
            if (createPart != null) {
                createPart._relationships = this._relationships;
                return createPart.getOutputStreamImpl();
            }
            throw new InvalidOperationException("Can't create a temporary part !");
        }
        return getOutputStreamImpl();
    }

    public abstract OutputStream getOutputStreamImpl();

    public ZipPackage getPackage() {
        return this._container;
    }

    public PackagePartName getPartName() {
        return this._partName;
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship getRelationship(String str) {
        return this._relationships.getRelationshipByID(str);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationshipCollection getRelationships() {
        return getRelationshipsCore(null);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationshipCollection getRelationshipsByType(String str) {
        return getRelationshipsCore(str);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public boolean hasRelationships() {
        PackageRelationshipCollection packageRelationshipCollection;
        if (!this._isRelationshipPart && (packageRelationshipCollection = this._relationships) != null && packageRelationshipCollection.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isDeleted() {
        return this._isDeleted;
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public boolean isRelationshipExists(PackageRelationship packageRelationship) {
        try {
            Iterator<PackageRelationship> it = getRelationships().iterator();
            while (it.hasNext()) {
                if (it.next() == packageRelationship) {
                    return true;
                }
            }
            return false;
        } catch (InvalidFormatException unused) {
            return false;
        }
    }

    public boolean isRelationshipPart() {
        return this._isRelationshipPart;
    }

    public abstract boolean load(InputStream inputStream);

    public void loadRelationships() {
        PackageRelationshipCollection packageRelationshipCollection = this._relationships;
        if ((packageRelationshipCollection == null || packageRelationshipCollection.size() == 0) && !this._isRelationshipPart) {
            throwExceptionIfRelationship();
            this._relationships = new PackageRelationshipCollection(this);
        }
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public void removeRelationship(String str) {
        PackageRelationshipCollection packageRelationshipCollection = this._relationships;
        if (packageRelationshipCollection != null) {
            packageRelationshipCollection.removeRelationship(str);
        }
    }

    public abstract boolean save(OutputStream outputStream);

    public void setContentType(String str) {
        if (this._container == null) {
            this._contentType = new ContentType(str);
            return;
        }
        throw new InvalidOperationException("You can't change the content type of a part.");
    }

    public void setDeleted(boolean z10) {
        this._isDeleted = z10;
    }

    public String toString() {
        return "Name: " + this._partName + " - Content Type: " + this._contentType.toString();
    }

    public PackagePart(ZipPackage zipPackage, PackagePartName packagePartName, ContentType contentType, boolean z10) {
        this._partName = packagePartName;
        this._contentType = contentType;
        this._container = zipPackage;
        this._isRelationshipPart = packagePartName.isRelationshipPartURI();
        if (z10) {
            loadRelationships();
        }
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addExternalRelationship(String str, String str2, String str3) {
        if (str != null) {
            if (str2 != null) {
                if (this._relationships == null) {
                    this._relationships = new PackageRelationshipCollection();
                }
                try {
                    return this._relationships.addRelationship(new URI(str), TargetMode.EXTERNAL, str2, str3);
                } catch (URISyntaxException e10) {
                    throw new IllegalArgumentException("Invalid target - " + e10);
                }
            }
            throw new IllegalArgumentException("relationshipType");
        }
        throw new IllegalArgumentException("target");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addRelationship(PackagePartName packagePartName, TargetMode targetMode, String str, String str2) {
        if (packagePartName != null) {
            if (targetMode != null) {
                if (str != null) {
                    if (!this._isRelationshipPart && !packagePartName.isRelationshipPartURI()) {
                        if (this._relationships == null) {
                            this._relationships = new PackageRelationshipCollection();
                        }
                        return this._relationships.addRelationship(packagePartName.getURI(), targetMode, str, str2);
                    }
                    throw new InvalidOperationException("Rule M1.25: The Relationships part shall not have relationships to any other part.");
                }
                throw new IllegalArgumentException("relationshipType");
            }
            throw new IllegalArgumentException("targetMode");
        }
        throw new IllegalArgumentException("targetPartName");
    }

    public PackagePart(ZipPackage zipPackage, PackagePartName packagePartName, String str) {
        this(zipPackage, packagePartName, new ContentType(str));
    }

    public PackageRelationship addRelationship(URI uri, TargetMode targetMode, String str) {
        return addRelationship(uri, targetMode, str, (String) null);
    }

    public PackageRelationship addRelationship(URI uri, TargetMode targetMode, String str, String str2) {
        if (uri != null) {
            if (targetMode != null) {
                if (str != null) {
                    if (!this._isRelationshipPart && !PackagingURIHelper.isRelationshipPartURI(uri)) {
                        if (this._relationships == null) {
                            this._relationships = new PackageRelationshipCollection();
                        }
                        return this._relationships.addRelationship(uri, targetMode, str, str2);
                    }
                    throw new InvalidOperationException("Rule M1.25: The Relationships part shall not have relationships to any other part.");
                }
                throw new IllegalArgumentException("relationshipType");
            }
            throw new IllegalArgumentException("targetMode");
        }
        throw new IllegalArgumentException("targetPartName");
    }
}
