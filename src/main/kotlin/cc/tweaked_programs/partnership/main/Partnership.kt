package cc.tweaked_programs.partnership.main

import cc.tweaked_programs.partnership.main.registries.*
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/*
[ ] = Planned
[-] = In work
[x] = Finished

TODO
	[x] Finish Boatyard block
		[x] Make block
		[x] Add Blockentity
		[x] Make an interface for it
		[x] Custom Recipe system etc.
	[ ] Make first custom boat (!!!)
		[ ] Add variants
		[ ] Make them fixable within leashes
	[ ] Add decorative stuff
		[ ] Marker buoys for borders on sea
		[ ] Light towers lamp
		[ ] Boat Cradle
		[ ] Marine hat
	[ ] Fun stuff
		[-] Hats
		[ ] Marine Cannon
		[ ] Schiffe versenken game
	[ ] Redo textures but good this time
*/

const val MOD_ID = "partnership"
const val BRAND_COLOR: Int = 0xFF2D54

object Partnership : ModInitializer {

	val logger: Logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		// WAKE UP
		BlockRegistries; BlockEntityRegistries; ItemRegistries; GroupRegistries; MenuRegistries; RecipeRegistries
	}
}