# TODO

If Github can't display this correctly, view the raw file

### Base classes


- [ ] class player.Player
- [ ] interface player.Porperty
	- [ ] class player.Ability implements Property
- [ ] class room.Room
- [ ] class item.Item
- [ ] class item.Container
- [ ] interface item.Placable
	- [ ] item.Box extends Container implements Placable
- [ ] entity.Entity
	- [ ] entity.HostileEntity extends Entity
	- [ ] entity.PassiveEntity extends Entity
- [ ] InputParcer
- [ ] Main
### Rooms

- [ ] class entity.Kobold extends PassiveEntity
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
	- [ ] contains gold
	- [ ] has a message directing you to the manual
