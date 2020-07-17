package Extra;

public enum WorkTime {
    FullTime((byte)1),MorningWork((byte)2),AfternoonWork((byte)3),NightWork((byte)4);
    private final byte value;
    WorkTime(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}
