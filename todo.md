# TODO

If Github can't display this correctly, view the raw file

### Base classes


- [x] class player.Player
- [x] class room.Room
- [x] class item.Item
- [x] class item.ContainerSlot
- [x] class item.Container
	- [x] item.Box extends Item / Container
- [x] entity.Entity
	- [x] entity.HostileEntity extends Entity
	- [x] entity.PassiveEntity extends Entity
	- [x] entity.ShopKeeper extends Entity
- [ ] InputParcer
- [ ] Main

GIT BRANCH HERE!!

Make a backup of the completely plain version. keep useing the master branch for the example stuff

### Rooms

- [ ] class entity.Kobold extends ShopKeeper
- [ ] class entity.Rival extends HostileEntity
- [ ] class item.Wand extends Item
- [ ] class item.KazabitWand extends Wand
- [ ] class item.Chest extends Box
- [ ] class room.StartRoom
	- [ ] Contains a chest with the wand in it
	- [ ] Makes the player equip the wand
	- [ ] connects to DemoRoom
- [ ] class room.DemoRoom
	- [ ] contains your Rival wich you have to attack
	- [ ] contains a kobold wich cannot fight
	- [ ] kobold gives you a wand
	- [ ] has a message directingyou to the manual
