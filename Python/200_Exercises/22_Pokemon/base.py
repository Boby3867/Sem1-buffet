import requests

psi = input("Name a Pokémon ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/"+ psi).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer
# pikachu
# /api/v2/pokemon/psyduck

print(pokemon["name"])
print(end="height is ")
print(pokemon["height"])
print(end="weight is ")
print(pokemon["weight"])
print(end="HP is ")
print(pokemon["stats"][0]["base_stat"])
print(end="Attack is ")
print(pokemon["stats"][1]["base_stat"])
print(end="Defense is ")
print(pokemon["stats"][2]["base_stat"])
print(end="Special attack is ")
print(pokemon["stats"][3]["base_stat"])
print(end="Special defense is ")
print(pokemon["stats"][4]["base_stat"])
print(end="Speed is ")
print(pokemon["stats"][5]["base_stat"])
# print(pokemon["ability"])