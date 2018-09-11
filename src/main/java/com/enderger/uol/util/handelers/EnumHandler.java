package com.enderger.uol.util.handelers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
    public static enum EnumType implements IStringSerializable {

        COPPER(0, "copper"),
        TIN(1, "tin"),
        ALUMINUM(2, "aluminum"),
        SILVER(3, "silver"),
        LEAD(4, "lead"),
        MITHRIL(5, "mithril"),
        NICKEL(6, "nickel"),
        PLATINUM(7, "platinum");

        private static final EnumType[] META_LOOKUP = new EnumType[values().length];
        private final int meta;
        private final String name, unlocalizedName;


        private EnumType(int meta, String name) {
            this(meta, name, name);
        }
        private EnumType(int meta, String name, String unlocalizedName) {
            this.meta = meta;
            this.name = name;
            this.unlocalizedName = unlocalizedName;
        }
        @Override
        public String getName() {
            return this.name;
        }
        public int getMeta() {
            return this.meta;
        }
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        @Override
        public String toString() {
            return this.name;
        }
        public static EnumType byMetadata(int meta) {
            return META_LOOKUP[meta];
        }
        static {
            for(EnumType enumtype : values()) {
                META_LOOKUP[enumtype.getMeta()] = enumtype;
            }
        }
    }
}
