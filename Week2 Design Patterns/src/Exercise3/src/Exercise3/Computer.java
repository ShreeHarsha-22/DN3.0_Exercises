package Exercise3;

public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;
    private String GPU;
    private String OS;

    // Private constructor to enforce the use of Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GPU = builder.GPU;
        this.OS = builder.OS;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Storage='" + Storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String Storage;
        private String GPU;
        private String OS;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

