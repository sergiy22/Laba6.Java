package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Phone landlinephone = new Phone(
                "Samsung S7",
                4,
                "Snapdragon 850",
                5,
                32
        );
        Cellphone cellphone = new Cellphone(
                "Samsung S10",
                8,
                "Exynos 9 ",
                6,
                128
        );
        Smartphone smartphone = new Smartphone(
                "iPhone X",
                3,
                "Apple A11",
                6,
                64
        );
        System.out.printf(landlinephone.toString());
        System.out.printf(cellphone.toString());
        System.out.printf(smartphone.toString());
    }
    static abstract class Telephone {
        private String model;
        private int cores;
        private String chipset;
        private int display;
        private int storage;

        public Telephone(String model, int cores, String chipset, int display, int storage) {
            this.model = model;
            this.cores = cores;
            this.chipset = chipset;
            this.display = display;
            this.storage = storage;
        }

        public abstract String getType();

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getCores() {
            return cores;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public String getChipset() {
            return chipset;
        }

        public void setChipset(String chipset) {
            this.chipset = chipset;
        }

        public int getDisplay() {
            return display;
        }

        public void setDisplay(int display) {
            this.display = display;
        }

        public int getStorage() {
            return storage;
        }

        public void setStorage(int storage) {
            this.storage = storage;
        }
        @Override
        public int hashCode() {
            int hash = 3;
            hash = 41 * hash + Objects.hashCode(this.model);
            hash = 41 * hash + this.cores;
            hash = 41 * hash + Objects.hashCode(this.chipset);
            hash = 41 * hash + this.display;
            hash = 41 * hash + this.storage;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Telephone other = (Telephone) obj;
            if (this.cores != other.cores) {
                return false;
            }
            if (this.display != other.display) {
                return false;
            }
            if (this.storage != other.storage) {
                return false;
            }
            if (!Objects.equals(this.model, other.model)) {
                return false;
            }
            if (!Objects.equals(this.chipset, other.chipset)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "\n" + "Тип: " + getType() + "\n" +
                    "Модель: " + getModel() + "\n" +
                    "Ядер: " + getCores() + "\n" +
                    "Мікросхема: " + getChipset() + "\n" +
                    "Розмір дисплею: " + getDisplay() + " дюйм\n" +
                    "Кількість пам'яті: " + getStorage() + " гб\n";
        }
    }
    static class Phone extends Telephone {
        private String DevType = "Phone";

        public Phone(String model, int cores, String chipset, int display, int storage) {
            super(model, cores, chipset, display, storage);
        }

        @Override
        public String getType() {
            return DevType;
        }
    }
    static class Smartphone extends Telephone {
        private String DevType = "Smartphone";

        public Smartphone(String model, int cores, String chipset, int display, int storsge) {
            super(model, cores, chipset, display, storsge);
        }

        @Override
        public String getType() {
            return DevType;
        }
    }
    static class Cellphone extends Telephone {
        private String DevType = "Cellphone";

        public Cellphone(String model, int cores, String chipset, int display, int storage) {
            super(model, cores, chipset, display, storage);
        }

        @Override
        public String getType() {
            return DevType;
        }
    }
}
