module ecommerce.shared {
    exports ecommerce.shared.model;
    exports ecommerce.shared.event;
    requires jeventbus.core;
    requires jeventbus.enterprise;
}