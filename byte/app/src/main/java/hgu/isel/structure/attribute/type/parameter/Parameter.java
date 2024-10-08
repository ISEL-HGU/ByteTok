package hgu.isel.structure.attribute.type.parameter;

public class Parameter {
    private byte[] nameIndex; // u2
    private byte[] accessFlags; // u2

    public byte[] getNameIndex() {
        return nameIndex;
    }

    public void setNameIndex(byte[] nameIndex) {
        this.nameIndex = nameIndex;
    }

    public byte[] getAccessFlags() {
        return accessFlags;
    }

    public void setAccessFlags(byte[] accessFlags) {
        this.accessFlags = accessFlags;
    }

    public Parameter(byte[] nameIndex, byte[] accessFlags) {
        this.nameIndex = nameIndex;
        this.accessFlags = accessFlags;
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(byte b : nameIndex) {
            stringBuilder.append(String.format("%02X", b));
        }

        for(byte b : accessFlags) {
            stringBuilder.append(String.format("%02X", b));
        }

        return stringBuilder.toString();
    }
}
