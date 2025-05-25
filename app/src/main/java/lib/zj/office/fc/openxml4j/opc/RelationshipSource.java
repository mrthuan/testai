package lib.zj.office.fc.openxml4j.opc;

/* loaded from: classes3.dex */
public interface RelationshipSource {
    PackageRelationship addExternalRelationship(String str, String str2);

    PackageRelationship addExternalRelationship(String str, String str2, String str3);

    PackageRelationship addRelationship(PackagePartName packagePartName, TargetMode targetMode, String str);

    PackageRelationship addRelationship(PackagePartName packagePartName, TargetMode targetMode, String str, String str2);

    void clearRelationships();

    PackageRelationship getRelationship(String str);

    PackageRelationshipCollection getRelationships();

    PackageRelationshipCollection getRelationshipsByType(String str);

    boolean hasRelationships();

    boolean isRelationshipExists(PackageRelationship packageRelationship);

    void removeRelationship(String str);
}
