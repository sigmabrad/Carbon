package bradhamster.carbon;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Carbon implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("carbon");

	public static final Item COFFEE = new Item(new Item.Settings());
	public static final Item SUSPICIOUS_SUBSTANCE = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, Identifier.of("carbon", "coffee"), COFFEE);
		Registry.register(Registries.ITEM, Identifier.of("carbon", "suspicious_substance"), SUSPICIOUS_SUBSTANCE);
	}
}