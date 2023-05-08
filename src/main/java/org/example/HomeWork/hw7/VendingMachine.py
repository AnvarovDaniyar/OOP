from typing import List

from hw7 import Drinks


class VendingMachinee:
    def init(self):
         self.drinks = []

         def addDrinks(self, drinks):
             self.drinks.append(drinks)

         def print(self):
             for drinks in self.drinks:
                 print(drinks)

         def getDrinks(self) -> List[Drinks]:
             return self.drinks

         def sort(self, comparator):
             self.drinks.sort(key=comparator.compare)