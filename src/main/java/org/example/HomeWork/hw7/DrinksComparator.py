from Drinks import Drinks

class DrinksComparator(Drinks):
    def init(self, type: str):
        self.type = type
def compare(self, o1: T, o2: T) -> int:
    if self.type == "volume":
        return o1.getVolume() - o2.getVolume()
    elif self.type == "temperature":
        return o1.getTemperature() - o2.getTemperature()
    else:
        return 0