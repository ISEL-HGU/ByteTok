package hgu.isel.structure.attribute.type.path;

public class Path {
    private byte typePathKind;
    private byte typeArgumentIndex;

    public byte getTypePathKind() {
        return typePathKind;
    }

    public void setTypePathKind(byte typePathKind) {
        this.typePathKind = typePathKind;
    }

    public byte getTypeArgumentIndex() {
        return typeArgumentIndex;
    }

    public void setTypeArgumentIndex(byte typeArgumentIndex) {
        this.typeArgumentIndex = typeArgumentIndex;
    }

    public Path(byte typePathKind, byte typeArgumentIndex) {
        this.typePathKind = typePathKind;
        this.typeArgumentIndex = typeArgumentIndex;
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%02X", typePathKind));
        stringBuilder.append(String.format("%02X", typeArgumentIndex));

        return stringBuilder.toString();
    }
}
