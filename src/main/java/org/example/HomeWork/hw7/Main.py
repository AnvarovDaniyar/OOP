from VendingMachinee import VendingMachinee
from Drinks import Drinks
from DrinksComparator import DrinksComparator

machinee = VendingMachinee()
machinee.addDrinkss(Drinks("coffee", 0.3, 70.0))
machinee.addDrinkss(Drinks("milk", 0.7, 43.7))
machinee.addDrinkss(Drinks("cappuccino", 0.3, 55.5))
machinee.addDrinkss(Drinks("tea", 0.5, 55.5))

machinee.sort(DrinksComparator("temperature"))
machinee.print()
print("****")
machinee.sort(DrinksComparator("volume"))
machinee.print()