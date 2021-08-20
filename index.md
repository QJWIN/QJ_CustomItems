# QJ_CustomItems v 1.4.1
### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Hi, and welcome to the main page of the QJ_CustomItems plugin !

This plugin working without Ressource pack, but if you wanna enjoy all plugin feature like he was 

created, you can add a texture pack ! 
```markdown
## _Textures List_
- soon
- soon
- soon
- soon
- soon
- soon
```
This plugin is made for our community minecraft server GODTHAB NETWORK

More description and picture will be added soon ...
### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## _Feature_
```markdown
# Feature in place :
- Add almost 50 items with specials ability
- Add a beheading system base on chance %
- Add a trashcan system 
- Add a record system for trash
- Add a Silkspawner system credit to : Karlofduty
- Add custom craft system
- Add a welcome message system
- Add a backpack system with base64 record

# Feature in dev :
- Add a record system for landmine to preserve it from reboot/restart/crash server
```



### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## _Config Options_
```yml
# ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████
#░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░
#
#     ██████          █████             █████████                      █████                             █████  █████
#   ███░░░░███       ░░███             ███░░░░░███                    ░░███                             ░░███  ░░███
#  ███    ░░███       ░███            ███     ░░░  █████ ████  █████  ███████    ██████  █████████████   ░███  ███████    ██████  █████████████    █████
# ░███     ░███       ░███           ░███         ░░███ ░███  ███░░  ░░░███░    ███░░███░░███░░███░░███  ░███ ░░░███░    ███░░███░░███░░███░░███  ███░░
# ░███   ██░███       ░███           ░███          ░███ ░███ ░░█████   ░███    ░███ ░███ ░███ ░███ ░███  ░███   ░███    ░███████  ░███ ░███ ░███ ░░█████
# ░░███ ░░████  ███   ░███           ░░███     ███ ░███ ░███  ░░░░███  ░███ ███░███ ░███ ░███ ░███ ░███  ░███   ░███ ███░███░░░   ░███ ░███ ░███  ░░░░███
# ░░░██████░██░░████████   █████████ ░░█████████  ░░████████ ██████   ░░█████ ░░██████  █████░███ █████ █████  ░░█████ ░░██████  █████░███ █████ ██████
# ░░░░░░ ░░  ░░░░░░░░   ░░░░░░░░░   ░░░░░░░░░    ░░░░░░░░ ░░░░░░     ░░░░░   ░░░░░░  ░░░░░ ░░░ ░░░░░ ░░░░░    ░░░░░   ░░░░░░  ░░░░░ ░░░ ░░░░░ ░░░░░░
#
#  ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████ ██████████
# ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░ ░░░░░░░░░░
#
#------------------------------------------------------------------------------------------------
# QJ_CustomItems Plugin CONFIG file
#------------------------------------------------------------------------------------------------
# version of the config
Version: 1.4.1
#------------------------------------------------------------------------------------------------
Main_Options:
  #------------------------------------------------------------------------------------------------
  # Prefix chat settings
  Prefix_String: "§6QJ_C§3ustom§6I§3tems §6- "
  #------------------------------------------------------------------------------------------------
  # default activation of message onjoin and onquit in the chat
  enable_welcome_message: true
  #------------------------------------------------------------------------------------------------
  # default activation of message onjoin and onquit in the chat
  enable_player_home: true
  #------------------------------------------------------------------------------------------------
  # default options for silkspawner
  Silkspawner:
    # enable the feature > true | disable to let use a another plugin > false
    enable_silkspawner: true
    # Drop spawner when breaking it : require pickaxe  ?
    Require_pickaxe: true
    # Drop spawner when breaking it : require silktouch ?
    Require_silktouch: true
  #------------------------------------------------------------------------------------------------
  # default activation of player_head drop when killed by a another player #chance 0.01 = 1%
  enable_beheading_player: true
  beheading_chance: 0.03
  #------------------------------------------------------------------------------------------------
  # Undeadsword Damagemultiplier for mob in %
  Undeadsword:
    Damagemultiplier:
      Zombie: 25
      Skeleton: 35
  #------------------------------------------------------------------------------------------------
```



### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## _Commandes_
```markdown
| Command name               | Permission       | Description                                                                        |
| :--------------------------|:-----------------| :----------------------------------------------------------------------------------|
| `sethome`                  | `home.global`    | Set a home for the player                                                          |
| `home`                     | `home.global`    | Tteleport the player to is home                                                    |
| `Give_GrapplingHook`       | `OP`             | Give a grappling hook to the player                                                |
| `Give_TeleportSword`       | `OP`             | Give a teleport sword to the player                                                |
| `Give_ServerGift`          | `OP`             | Give a ServerGift to the player                                                    |
| `Give_ExplosiveBow`        | `OP`             | Give a ExplosiveBow to the player                                                  |
| `Give_InfiniteWaterBucket` | `OP`             | Give a InfiniteWaterBucket to the player                                           |
| `Give_InfiniteLavaBucket`  | `OP`             | Give a InfiniteLavaBucket to the player                                            |
| `Give_MachineGunBow`       | `OP`             | Give a MachineGunBow to the player                                                 |
| `Give_MultiBreakPickaxe`   | `OP`             | Give a MultiBreakPickaxe to the player                                             |
| `Give_CresusPickaxe`       | `OP`             | Give a CresusPickaxe to the player                                                 |
| `Give_Boomerang`           | `OP`             | Give a Boomerang to the player                                                     |
| `Give_HomingBow`           | `OP`             | Give a HomingBow to the player                                                     |
| `Give_ThrowingAxe`         | `OP`             | Give a ThrowingAxe to the player                                                   |
| `Give_UndeadSword`         | `OP`             | Give a UndeadSword to the player                                                   |
| `Give_Dynamite`            | `OP`             | Give a Dynamite to the player                                                      |
| `Give_LightingSword`       | `OP`             | Give a LightingSword to the player                                                 |
| `Give_AutoSmeltPickaxe`    | `OP`             | Give a AutoSmeltPickaxe to the player                                              |
| `Give_FireBall`            | `OP`             | Give a FireBall to the player                                                      |
| `Give_Grenade`             | `OP`             | Give a Grenade to the player                                                       |
| `Give_HermesShoes`         | `OP`             | Give a HermesShoes to the player                                                   |
| `Give_Landmine`            | `OP`             | Give a Landmine to the player                                                      |
| `Give_InfiniteEmptyBucket` | `OP`             | Give a InfiniteEmptyBucket to the player                                           |
| `Give_Potion_haste_1`      | `OP`             | Give a haste 1 potion to the player                                                |
| `Give_Potion_haste_2`      | `OP`             | Give a haste 2 potion to the player                                                |
| `Give_Potion_haste_3`      | `OP`             | Give a haste 3 potion to the player                                                |
| `Give_Potion_luck_1`       | `OP`             | Give a luck 1 potion to the player                                                 |
| `Give_Potion_luck_2`       | `OP`             | Give a luck 2 potion to the player                                                 |
| `Give_Potion_luck_3`       | `OP`             | Give a luck 3 potion to the player                                                 |
| `Give_Potion_Resistance_1` | `OP`             | Give a resistance 1 potion to the player                                           |
| `Give_Potion_Beauty_1`     | `OP`             | Give a Beauty 1 potion to the player                                               |
| `Give_Potion_Saturation_1` | `OP`             | Give a Saturation 1 potion to the player                                           |
| `Give_Potion_Absorption_1` | `OP`             | Give a Absorption 2 potion to the player                                           |
| `Give_Potion_HealBoost_1`  | `OP`             | Give a HealBoost 3 potion to the player                                            |
| `Give_Potions`             | `OP`             | Give all potions to the player                                                     |
| `Give_Hat_Farmer`          | `OP`             | Give a Hat_Farmer to the player                                                    |
| `Give_Hat_Arrow`           | `OP`             | Give a Hat_Arrow to the player                                                     |
| `Give_Hat_Fes`             | `OP`             | Give a Hat_Fes to the player                                                       |
| `Give_Hat_Indian`          | `OP`             | Give a Hat_Indian to the player                                                    |
| `Give_Hat_Dandy_RED`       | `OP`             | Give a Hat_Dandy_RED to the player                                                 |
| `Give_Hat_Dandy_LBLUE`     | `OP`             | Give a Give_Hat_Dandy_LBLUE to the player                                          |
| `Give_Hat_Dandy_YELLOW`    | `OP`             | Give a Give_Hat_Dandy_YELLOW to the player                                         |
| `Give_Hat_Dandy_LIME`      | `OP`             | Give a Give_Hat_Dandy_LIME  to the player                                          |
| `Give_Hat_Dandy_RAINBOW`   | `OP`             | Give a Hat_Dandy_RAINBOW to the player                                             |
| `Give_Hat_Dandy_GLASS`     | `OP`             | Give a Hat_Dandy_GLASS to the player                                               |
| `Give_Hat_Squid`           | `OP`             | Give a Hat_Squid to the player                                                     |
| `Give_Hats`                | `OP`             | Give all Hats to the player                                                        |
| `Give_TrashCan`            | `trashcan.use`   | Give a TrashCan to the player                                                      |
| `Give_Backpack`            | `backpacks.use`  | Give a backpacks to the player                                                     |
```



### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## _Permissions_
```markdown
| Permission name            | Default value    | Description                                                                        |
| :--------------------------|:-----------------| :----------------------------------------------------------------------------------|
| `silkspawner.allowdrop`    | `true`           | Lets the player use spawner system                                                 |
| `trashcan.use`             | `true`           | Lets the player use trashcan system                                                |
| `home.global`              | `true`           | Lets the use setthome and home system                                              |
| `backpacks.use`            | `true`           | Lets the use backpacks system                                                      |
```



### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## _Download_
Tested on Spigot v 1.16.5
- Update N° 6 - [v 1.4.1](https://github.com/QJWIN/QJ_CustomItems/releases/download/v1.4.1/QJ_CustomItems.jar) - Lastest ( recommended )
- Update N° 5 - [v 1.4.0]() - Disabled
- Update N° 4 - [v 1.3.0](https://github.com/QJWIN/QJ_CustomItems/releases/download/v1.3.0/QJ_CustomItems.jar) - Available
- Update N° 3 - [v 1.2.2](https://github.com/QJWIN/QJ_CustomItems/releases/download/v1.2.2/QJ_CustomItems.jar) - Available
- Update N° 2 - [v 1.2.1]() - Disabled
- Update N° 1 - [v 1.2.0]() - Disabled


### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Support or Contact via  :
Join us in our discord to get support for any question you have about the usage of this plugin.

For join us click on the link => ▁▂▃▅▆▇ ● [Join discord now !](https://discord.gg/CjAJjQc) ● ▇▆▅▃▂▁

### --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

QJ_CustomItems made by QJWIN - ⓒ 2021 under license : [ GPL-3.0 License ](https://github.com/QJWIN/QJ_CustomItems/blob/master/LICENSE)
