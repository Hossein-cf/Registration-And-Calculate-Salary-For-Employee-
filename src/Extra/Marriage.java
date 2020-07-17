package Extra;

public enum Marriage {
    Married((byte)1),Single((byte)2);
    private final byte value;
    Marriage(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}

