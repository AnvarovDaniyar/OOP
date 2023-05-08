class Drinkss:

    def init(self, name: str, volume: float, temperature: float):

        self.name = name
        self.volume = volume
        self.temperature = temperature

def getName(self) -> str:
    return self.name

def setName(self, name: str):
    self.name = name

def getVolume(self) -> float:
    return self.volume

def setVolume(self, volume: float):
    self.volume = volume

def getTemperature(self) -> float:
    return self.temperature

def setTemperature(self, temperature: float):
    self.temperature = temperature

def __str__(self):
    return f"{self.name}, volume={self.volume}, temperature={self.temperature}"
