package lib.zj.office.fc.openxml4j.opc;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import lib.zj.office.fc.EncryptedDocumentException;
import lib.zj.office.fc.fs.storage.LittleEndian;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.openxml4j.exceptions.InvalidOperationException;
import lib.zj.office.fc.openxml4j.exceptions.OpenXML4JException;
import lib.zj.office.fc.openxml4j.exceptions.OpenXML4JRuntimeException;
import lib.zj.office.fc.openxml4j.opc.internal.ContentType;
import lib.zj.office.fc.openxml4j.opc.internal.ContentTypeManager;
import lib.zj.office.fc.openxml4j.opc.internal.FileHelper;
import lib.zj.office.fc.openxml4j.opc.internal.PackagePropertiesPart;
import lib.zj.office.fc.openxml4j.opc.internal.PartMarshaller;
import lib.zj.office.fc.openxml4j.opc.internal.PartUnmarshaller;
import lib.zj.office.fc.openxml4j.opc.internal.ZipHelper;
import lib.zj.office.fc.openxml4j.opc.internal.marshallers.DefaultMarshaller;
import lib.zj.office.fc.openxml4j.opc.internal.marshallers.ZipPackagePropertiesMarshaller;
import lib.zj.office.fc.openxml4j.opc.internal.marshallers.ZipPartMarshaller;
import lib.zj.office.fc.openxml4j.opc.internal.unmarshallers.PackagePropertiesUnmarshaller;
import lib.zj.office.fc.openxml4j.opc.internal.unmarshallers.UnmarshallContext;
import lib.zj.office.fc.openxml4j.util.ZipEntrySource;
import lib.zj.office.fc.openxml4j.util.ZipFileZipEntrySource;
import lib.zj.office.fc.openxml4j.util.ZipInputStreamZipEntrySource;

/* loaded from: classes3.dex */
public class ZipPackage implements RelationshipSource, Closeable {
    private static final String TAG = "ZipPackage";
    protected ContentTypeManager contentTypeManager;
    protected PartMarshaller defaultPartMarshaller;
    protected boolean isDirty;
    protected String originalPackagePath;
    protected OutputStream output;
    protected PackagePropertiesPart packageProperties;
    protected PackagePartCollection partList;
    protected Hashtable<ContentType, PartMarshaller> partMarshallers;
    protected Hashtable<ContentType, PartUnmarshaller> partUnmarshallers;
    protected PackageRelationshipCollection relationships;
    private ZipEntrySource zipArchive;

    public ZipPackage(String str, boolean z10) {
        this.isDirty = false;
        if (str != null && !"".equals(str.trim()) && (!new File(str).exists() || !new File(str).isDirectory())) {
            init();
            try {
                if (z10) {
                    this.zipArchive = new ZipInputStreamZipEntrySource(new ZipInputStream(new FileInputStream(str)));
                    if (getParts().isEmpty()) {
                        throw new EncryptedDocumentException("Format error");
                    }
                } else {
                    this.zipArchive = new ZipFileZipEntrySource(getZipFile(str));
                }
                getParts();
                this.originalPackagePath = new File(str).getAbsolutePath();
                return;
            } catch (Exception unused) {
                File file = new File(str);
                if (file.length() != 0) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        byte[] bArr = new byte[16];
                        fileInputStream.read(bArr);
                        if (LittleEndian.getLong(bArr, 0) == -2226271756974174256L) {
                            throw new EncryptedDocumentException("Cannot process encrypted office files!");
                        }
                    } catch (IOException unused2) {
                    }
                    throw new EncryptedDocumentException("Invalid header signature");
                }
                throw new EncryptedDocumentException("Format error");
            }
        }
        throw new IllegalArgumentException("path");
    }

    private PackagePartName buildPartName(ZipEntry zipEntry) {
        try {
            if (zipEntry.getName().equalsIgnoreCase(ContentTypeManager.CONTENT_TYPES_PART_NAME)) {
                return null;
            }
            return PackagingURIHelper.createPartName(ZipHelper.getOPCNameFromZipItemName(zipEntry.getName()));
        } catch (Exception unused) {
            return null;
        }
    }

    private synchronized String generateTempFileName(File file) {
        File file2;
        do {
            file2 = new File(file.getAbsoluteFile() + File.separator + "OpenXML4J" + System.nanoTime());
        } while (file2.exists());
        return FileHelper.getFilename(file2.getAbsoluteFile());
    }

    private PackageRelationshipCollection getRelationshipsHelper(String str) {
        ensureRelationships();
        return this.relationships.getRelationships(str);
    }

    private ZipFile getZipFile(String str) {
        int i10 = 3;
        while (i10 > 0) {
            try {
                return new ZipFile(new File(str));
            } catch (ZipException e10) {
                e10.getMessage();
                e10.getClass().toString();
                Thread.sleep(1000L);
                i10--;
                if (i10 == 0) {
                    throw e10;
                }
            }
        }
        return null;
    }

    private void init() {
        this.partMarshallers = new Hashtable<>(5);
        Hashtable<ContentType, PartUnmarshaller> hashtable = new Hashtable<>(2);
        this.partUnmarshallers = hashtable;
        try {
            hashtable.put(new ContentType(ContentTypes.CORE_PROPERTIES_PART), new PackagePropertiesUnmarshaller());
            this.defaultPartMarshaller = new DefaultMarshaller();
            this.partMarshallers.put(new ContentType(ContentTypes.CORE_PROPERTIES_PART), new ZipPackagePropertiesMarshaller());
        } catch (InvalidFormatException e10) {
            throw new OpenXML4JRuntimeException("Package.init() : this exception should never happen, if you read this message please send a mail to the developers team. : " + e10.getMessage());
        }
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addExternalRelationship(String str, String str2) {
        return addExternalRelationship(str, str2, null);
    }

    public void addMarshaller(String str, PartMarshaller partMarshaller) {
        try {
            this.partMarshallers.put(new ContentType(str), partMarshaller);
        } catch (InvalidFormatException unused) {
        }
    }

    public PackagePart addPackagePart(PackagePart packagePart) {
        if (packagePart != null) {
            if (this.partList.containsKey(packagePart._partName)) {
                if (this.partList.get(packagePart._partName).isDeleted()) {
                    packagePart.setDeleted(false);
                    this.partList.remove((Object) packagePart._partName);
                } else {
                    throw new InvalidOperationException("A part with the name '" + packagePart._partName.getName() + "' already exists : Packages shall not contain equivalent part names and package implementers shall neither create nor recognize packages with equivalent part names. [M1.12]");
                }
            }
            this.partList.put(packagePart._partName, packagePart);
            this.isDirty = true;
            return packagePart;
        }
        throw new IllegalArgumentException("part");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addRelationship(PackagePartName packagePartName, TargetMode targetMode, String str, String str2) {
        if (str.equals(PackageRelationshipTypes.CORE_PROPERTIES) && this.packageProperties != null) {
            throw new InvalidOperationException("OPC Compliance error [M4.1]: can't add another core properties part ! Use the built-in package method instead.");
        }
        if (!packagePartName.isRelationshipPartURI()) {
            ensureRelationships();
            PackageRelationship addRelationship = this.relationships.addRelationship(packagePartName.getURI(), targetMode, str, str2);
            this.isDirty = true;
            return addRelationship;
        }
        throw new InvalidOperationException("Rule M1.25: The Relationships part shall not have relationships to any other part.");
    }

    public void addUnmarshaller(String str, PartUnmarshaller partUnmarshaller) {
        try {
            this.partUnmarshallers.put(new ContentType(str), partUnmarshaller);
        } catch (InvalidFormatException unused) {
        }
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public void clearRelationships() {
        PackageRelationshipCollection packageRelationshipCollection = this.relationships;
        if (packageRelationshipCollection != null) {
            packageRelationshipCollection.clear();
            this.isDirty = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        try {
            reentrantReadWriteLock.writeLock().lock();
            String str = this.originalPackagePath;
            if (str != null && !"".equals(str.trim())) {
                File file = new File(this.originalPackagePath);
                if (file.exists() && this.originalPackagePath.equalsIgnoreCase(file.getAbsolutePath())) {
                    closeImpl();
                }
                save(file);
            } else {
                OutputStream outputStream = this.output;
                if (outputStream != null) {
                    save(outputStream);
                    this.output.close();
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
            this.contentTypeManager.clearAll();
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }

    public void closeImpl() {
        flush();
        String str = this.originalPackagePath;
        if (str != null && !"".equals(str)) {
            File file = new File(this.originalPackagePath);
            if (file.exists()) {
                File createTempFile = File.createTempFile(generateTempFileName(FileHelper.getDirectory(file)), ".tmp");
                try {
                    save(createTempFile);
                    this.zipArchive.close();
                    FileHelper.copyFile(createTempFile, file);
                    return;
                } finally {
                    createTempFile.delete();
                }
            }
            throw new InvalidOperationException("Can't close a package not previously open with the open() method !");
        }
    }

    public boolean containPart(PackagePartName packagePartName) {
        if (getPart(packagePartName) != null) {
            return true;
        }
        return false;
    }

    public PackagePart createPart(PackagePartName packagePartName, String str) {
        return createPart(packagePartName, str, true);
    }

    public PackagePart createPartImpl(PackagePartName packagePartName, String str, boolean z10) {
        return null;
    }

    public void deletePart(PackagePartName packagePartName) {
        if (packagePartName != null) {
            removePart(packagePartName);
            removePart(PackagingURIHelper.getRelationshipPartName(packagePartName));
            return;
        }
        throw new IllegalArgumentException("partName");
    }

    public void deletePartRecursive(PackagePartName packagePartName) {
        if (packagePartName != null && containPart(packagePartName)) {
            PackagePart part = getPart(packagePartName);
            removePart(packagePartName);
            try {
                Iterator<PackageRelationship> it = part.getRelationships().iterator();
                while (it.hasNext()) {
                    deletePartRecursive(PackagingURIHelper.createPartName(PackagingURIHelper.resolvePartUri(packagePartName.getURI(), it.next().getTargetURI())));
                }
                PackagePartName relationshipPartName = PackagingURIHelper.getRelationshipPartName(packagePartName);
                if (relationshipPartName != null && containPart(relationshipPartName)) {
                    removePart(relationshipPartName);
                    return;
                }
                return;
            } catch (InvalidFormatException unused) {
                return;
            }
        }
        throw new IllegalArgumentException("partName");
    }

    public void ensureRelationships() {
        if (this.relationships == null) {
            try {
                this.relationships = new PackageRelationshipCollection(this);
            } catch (InvalidFormatException unused) {
                this.relationships = new PackageRelationshipCollection();
            }
        }
    }

    public void flush() {
        PackagePropertiesPart packagePropertiesPart = this.packageProperties;
        if (packagePropertiesPart != null) {
            packagePropertiesPart.flush();
        }
    }

    public PackageProperties getPackageProperties() {
        if (this.packageProperties == null) {
            this.packageProperties = new PackagePropertiesPart(this, PackagingURIHelper.CORE_PROPERTIES_PART_NAME);
        }
        return this.packageProperties;
    }

    public PackagePart getPart(URI uri) {
        if (uri != null) {
            try {
                if (this.partList == null) {
                    getParts();
                }
                return getPartImpl(PackagingURIHelper.createPartName(uri));
            } catch (InvalidFormatException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("partName");
    }

    public PackagePart getPartImpl(PackagePartName packagePartName) {
        if (this.partList.containsKey(packagePartName)) {
            return this.partList.get(packagePartName);
        }
        return null;
    }

    public ArrayList<PackagePart> getParts() {
        String contentType;
        if (this.partList == null) {
            try {
                this.partList = new PackagePartCollection();
                Enumeration<? extends ZipEntry> entries = this.zipArchive.getEntries();
                while (true) {
                    if (!entries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement.getName().equalsIgnoreCase(ContentTypeManager.CONTENT_TYPES_PART_NAME)) {
                        InputStream inputStream = this.zipArchive.getInputStream(nextElement);
                        this.contentTypeManager = new ContentTypeManager(inputStream, this);
                        inputStream.close();
                        break;
                    }
                }
                Enumeration<? extends ZipEntry> entries2 = this.zipArchive.getEntries();
                while (entries2.hasMoreElements()) {
                    ZipEntry nextElement2 = entries2.nextElement();
                    PackagePartName buildPartName = buildPartName(nextElement2);
                    if (buildPartName != null && (contentType = this.contentTypeManager.getContentType(buildPartName)) != null) {
                        ZipPackagePart zipPackagePart = new ZipPackagePart(this, nextElement2, buildPartName, contentType);
                        if (contentType.equals(ContentTypes.CORE_PROPERTIES_PART)) {
                            PartUnmarshaller partUnmarshaller = this.partUnmarshallers.get(contentType);
                            if (partUnmarshaller != null) {
                                PackagePart unmarshall = partUnmarshaller.unmarshall(new UnmarshallContext(this, zipPackagePart._partName), zipPackagePart.getInputStream());
                                this.partList.put(unmarshall._partName, unmarshall);
                                if (unmarshall instanceof PackagePropertiesPart) {
                                    this.packageProperties = (PackagePropertiesPart) unmarshall;
                                }
                            }
                        } else {
                            this.partList.put(buildPartName, (PackagePart) zipPackagePart);
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        ArrayList<PackagePart> arrayList = new ArrayList<>(this.partList.values());
        Iterator<PackagePart> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().loadRelationships();
        }
        return arrayList;
    }

    public ArrayList<PackagePart> getPartsByContentType(String str) {
        ArrayList<PackagePart> arrayList = new ArrayList<>();
        for (PackagePart packagePart : this.partList.values()) {
            if (packagePart.getContentType().equals(str)) {
                arrayList.add(packagePart);
            }
        }
        return arrayList;
    }

    public List<PackagePart> getPartsByName(Pattern pattern) {
        if (pattern != null) {
            ArrayList arrayList = new ArrayList();
            for (PackagePart packagePart : this.partList.values()) {
                if (pattern.matcher(packagePart.getPartName().getName()).matches()) {
                    arrayList.add(packagePart);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("name pattern must not be null");
    }

    public ArrayList<PackagePart> getPartsByRelationshipType(String str) {
        if (str != null) {
            ArrayList<PackagePart> arrayList = new ArrayList<>();
            Iterator<PackageRelationship> it = getRelationshipsByType(str).iterator();
            while (it.hasNext()) {
                arrayList.add(getPart(it.next()));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("relationshipType");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship getRelationship(String str) {
        return this.relationships.getRelationshipByID(str);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationshipCollection getRelationships() {
        return getRelationshipsHelper(null);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationshipCollection getRelationshipsByType(String str) {
        if (str != null) {
            return getRelationshipsHelper(str);
        }
        throw new IllegalArgumentException("relationshipType");
    }

    public ZipEntrySource getZipArchive() {
        return this.zipArchive;
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public boolean hasRelationships() {
        if (this.relationships.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public boolean isRelationshipExists(PackageRelationship packageRelationship) {
        Iterator<PackageRelationship> it = getRelationships().iterator();
        while (it.hasNext()) {
            if (it.next() == packageRelationship) {
                return true;
            }
        }
        return false;
    }

    public void removeMarshaller(String str) {
        this.partMarshallers.remove(str);
    }

    public void removePart(PackagePart packagePart) {
        if (packagePart != null) {
            removePart(packagePart.getPartName());
        }
    }

    public void removePartRecursive(PackagePartName packagePartName) {
        PackagePart packagePart = this.partList.get(PackagingURIHelper.getRelationshipPartName(packagePartName));
        PackagePart packagePart2 = this.partList.get(packagePartName);
        if (packagePart != null) {
            Iterator<PackageRelationship> it = new PackageRelationshipCollection(packagePart2).iterator();
            while (it.hasNext()) {
                PackageRelationship next = it.next();
                removePart(PackagingURIHelper.createPartName(PackagingURIHelper.resolvePartUri(next.getSourceURI(), next.getTargetURI())));
            }
            removePart(packagePart._partName);
        }
        removePart(packagePart2._partName);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public void removeRelationship(String str) {
        PackageRelationshipCollection packageRelationshipCollection = this.relationships;
        if (packageRelationshipCollection != null) {
            packageRelationshipCollection.removeRelationship(str);
            this.isDirty = true;
        }
    }

    public void removeUnmarshaller(String str) {
        this.partUnmarshallers.remove(str);
    }

    public void revert() {
        revertImpl();
    }

    public void revertImpl() {
        try {
            ZipEntrySource zipEntrySource = this.zipArchive;
            if (zipEntrySource != null) {
                zipEntrySource.close();
            }
        } catch (Throwable unused) {
        }
    }

    public void save(File file) {
        if (file != null) {
            if (file.exists() && file.getAbsolutePath().equals(this.originalPackagePath)) {
                throw new InvalidOperationException("You can't call save(File) to save to the currently open file. To save to the current file, please just call close()");
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                save(fileOutputStream);
                fileOutputStream.close();
                return;
            } catch (FileNotFoundException e10) {
                throw new IOException(e10.getLocalizedMessage());
            }
        }
        throw new IllegalArgumentException("targetFile");
    }

    public void saveImpl(OutputStream outputStream) {
        ZipOutputStream zipOutputStream;
        try {
            if (!(outputStream instanceof ZipOutputStream)) {
                zipOutputStream = new ZipOutputStream(outputStream);
            } else {
                zipOutputStream = (ZipOutputStream) outputStream;
            }
            if (getPartsByRelationshipType(PackageRelationshipTypes.CORE_PROPERTIES).size() == 0 && getPartsByRelationshipType(PackageRelationshipTypes.CORE_PROPERTIES_ECMA376).size() == 0) {
                new ZipPackagePropertiesMarshaller().marshall(this.packageProperties, zipOutputStream);
                this.relationships.addRelationship(this.packageProperties.getPartName().getURI(), TargetMode.INTERNAL, PackageRelationshipTypes.CORE_PROPERTIES, null);
                if (!this.contentTypeManager.isContentTypeRegister(ContentTypes.CORE_PROPERTIES_PART)) {
                    this.contentTypeManager.addContentType(this.packageProperties.getPartName(), ContentTypes.CORE_PROPERTIES_PART);
                }
            }
            ZipPartMarshaller.marshallRelationshipPart(getRelationships(), PackagingURIHelper.PACKAGE_RELATIONSHIPS_ROOT_PART_NAME, zipOutputStream);
            this.contentTypeManager.save(zipOutputStream);
            Iterator<PackagePart> it = getParts().iterator();
            while (it.hasNext()) {
                PackagePart next = it.next();
                if (!next.isRelationshipPart()) {
                    PartMarshaller partMarshaller = this.partMarshallers.get(next._contentType);
                    if (partMarshaller != null) {
                        if (!partMarshaller.marshall(next, zipOutputStream)) {
                            throw new OpenXML4JException("The part " + next.getPartName().getURI() + " fail to be saved in the stream with marshaller " + partMarshaller);
                        }
                    } else if (!this.defaultPartMarshaller.marshall(next, zipOutputStream)) {
                        throw new OpenXML4JException("The part " + next.getPartName().getURI() + " fail to be saved in the stream with marshaller " + this.defaultPartMarshaller);
                    }
                }
            }
            zipOutputStream.close();
        } catch (Exception e10) {
            throw new OpenXML4JRuntimeException("Fail to save: an error occurs while saving the package : " + e10.getMessage(), e10);
        }
    }

    public boolean validatePackage(ZipPackage zipPackage) {
        throw new InvalidOperationException("Not implemented yet !!!");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addExternalRelationship(String str, String str2, String str3) {
        if (str != null) {
            if (str2 != null) {
                try {
                    URI uri = new URI(str);
                    ensureRelationships();
                    PackageRelationship addRelationship = this.relationships.addRelationship(uri, TargetMode.EXTERNAL, str2, str3);
                    this.isDirty = true;
                    return addRelationship;
                } catch (URISyntaxException e10) {
                    throw new IllegalArgumentException("Invalid target - " + e10);
                }
            }
            throw new IllegalArgumentException("relationshipType");
        }
        throw new IllegalArgumentException("target");
    }

    public PackagePart createPart(PackagePartName packagePartName, String str, boolean z10) {
        if (packagePartName != null) {
            if (str != null && !str.equals("")) {
                if (this.partList.containsKey(packagePartName) && !this.partList.get(packagePartName).isDeleted()) {
                    throw new InvalidOperationException("A part with the name '" + packagePartName.getName() + "' already exists : Packages shall not contain equivalent part names and package implementers shall neither create nor recognize packages with equivalent part names. [M1.12]");
                } else if (str.equals(ContentTypes.CORE_PROPERTIES_PART) && this.packageProperties != null) {
                    throw new InvalidOperationException("OPC Compliance error [M4.1]: you try to add more than one core properties relationship in the package !");
                } else {
                    PackagePart createPartImpl = createPartImpl(packagePartName, str, z10);
                    this.contentTypeManager.addContentType(packagePartName, str);
                    this.partList.put(packagePartName, createPartImpl);
                    this.isDirty = true;
                    return createPartImpl;
                }
            }
            throw new IllegalArgumentException("contentType");
        }
        throw new IllegalArgumentException("partName");
    }

    public void removePart(PackagePartName packagePartName) {
        PackagePart part;
        if (packagePartName != null && containPart(packagePartName)) {
            if (this.partList.containsKey(packagePartName)) {
                this.partList.get(packagePartName).setDeleted(true);
                this.partList.remove((Object) packagePartName);
            }
            this.contentTypeManager.removeContentType(packagePartName);
            if (packagePartName.isRelationshipPartURI()) {
                try {
                    PackagePartName createPartName = PackagingURIHelper.createPartName(PackagingURIHelper.getSourcePartUriFromRelationshipPartUri(packagePartName.getURI()));
                    if (createPartName.getURI().equals(PackagingURIHelper.PACKAGE_ROOT_URI)) {
                        clearRelationships();
                    } else if (containPart(createPartName) && (part = getPart(createPartName)) != null) {
                        part.clearRelationships();
                    }
                } catch (InvalidFormatException unused) {
                    return;
                }
            }
            this.isDirty = true;
            return;
        }
        throw new IllegalArgumentException("partName");
    }

    public PackagePart getPart(PackagePartName packagePartName) {
        if (packagePartName != null) {
            if (this.partList == null) {
                try {
                    getParts();
                } catch (InvalidFormatException unused) {
                    return null;
                }
            }
            return getPartImpl(packagePartName);
        }
        throw new IllegalArgumentException("partName");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.RelationshipSource
    public PackageRelationship addRelationship(PackagePartName packagePartName, TargetMode targetMode, String str) {
        return addRelationship(packagePartName, targetMode, str, null);
    }

    public void save(OutputStream outputStream) {
        saveImpl(outputStream);
    }

    public PackagePart getPart(PackageRelationship packageRelationship) {
        ensureRelationships();
        Iterator<PackageRelationship> it = this.relationships.iterator();
        while (it.hasNext()) {
            PackageRelationship next = it.next();
            if (next.getRelationshipType().equals(packageRelationship.getRelationshipType())) {
                try {
                    return getPart(PackagingURIHelper.createPartName(next.getTargetURI()));
                } catch (InvalidFormatException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public PackagePart createPart(PackagePartName packagePartName, String str, ByteArrayOutputStream byteArrayOutputStream) {
        PackagePart createPart = createPart(packagePartName, str);
        if (createPart != null && byteArrayOutputStream != null) {
            try {
                OutputStream outputStream = createPart.getOutputStream();
                if (outputStream == null) {
                    return null;
                }
                outputStream.write(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                outputStream.close();
                return createPart;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public ZipPackage(String str) {
        this(str, false);
    }

    public ZipPackage(InputStream inputStream) {
        this.isDirty = false;
        try {
            init();
            this.zipArchive = new ZipInputStreamZipEntrySource(new ZipInputStream(inputStream));
            getParts();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
