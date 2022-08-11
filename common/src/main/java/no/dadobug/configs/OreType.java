package no.dadobug.configs;

public enum OreType {
    // Vanilla
    IRON("Iron"),
    COAL("Coal"),
    GOLD("Gold"),
    REDSTONE("Redstone"),
    DIAMOND("Diamond"),
    LAPIS("Lapis"),
    COPPER("Copper"),
    EMERALD("Emerald"),
    WATER("Water"),
    LAVA("Lava"),
    MILK("Milk"),
    COOKIE("Cookie"),
    HOLLOW("Hollow"),
    XP("Xp"),
    QUARTZ("Quartz"),
    NETHERITE("Netherite"),

    // Techreborn
    ALUMINUM("Aluminum"),
    GALENA("Galena"),
    IRIDIUM("Iridium"),
    LEAD("Lead"),
    RUBY("Ruby"),
    SPHALERITE("Sphalerite"),
    SAPPHIRE("Sapphire"),
    SILVER("Silver"),
    TIN("Tin"),
    CINNABAR("Cinnabar"),
    PYRITE("Pyrite"),
    PERIDOT("Perido"),
    SHELDONITE("Sheldonite"),
    SODALITE("Sodalite"),
    TUNGSTEN("Tungsten"),

    // Tconstruct
    COBALT("Cobalt"),
    ARDITE("Ardite"),

    // AE2
    CERTUS_QUARTZ("Certus Quartz"),

    // Big reactors
    URANIUM("Uranium"),
    YELLORIUM("Yellorium"),
    ANGLESITE("Anglesite"),
    BENITOITE("Benitoite"),

    // Immersive Engineering
    NICKEL("Nickel"),

    // Mythic Metals
    ADAMANTINE("Adamantine"),
    AQUARIUM("Aquarium"),
    BANGLUM("Banglum"),
    CARMOT("Carmot"),
    KYBER("Kyber"),
    MANGANESE("Manganese"),
    MORKITE("Morkite"), //ROCK AND STONE
    MITHRIL("Mithril"),
    ORICHALCUM("Orichalcum"),
    OSMIUM("Osmium"),
    PLATINUM("Platinum"),
    PROMETHEUM("Prometheum"),
    QUADRILLUM("Quadrillum"),
    RUNITE("Runite"),
    STARRITE("Starrite"),
    UNOBTAINIUM("Unobtainium"),
    MIDAS_GOLD("Midas Gold"),
    PALLADIUM("Palladium"),
    STORMYX("Stormyx"),

    // Create
    ZINC("Zinc"),

    // Mekanism
    FLUORITE("Fluorite"),

    // Undergarden
    CLOGGRUM("Cloggrum"),
    FROSTSTEEL("Froststeel"),
    UTHERIUM("Utherium"),

    // Beyond Earth
    DESH("Desh"),
    CHEESE("Cheese"),
    ICE_SHARD("Ice Shard"),
    OSTRUM("Ostrum"),
    CALORITE("Calorite");

    public final String key;

    OreType(String key) {
        this.key = key;
    }
}
