### Junior/Mid-Level csoport mai feladata:

Készíts egy osztályt a `week07d01` csomagba `MathAlgorithms` néven. Ebben az osztályban legyen egy `isPrime(int x)` metódus ami a paraméterül kapott számról eldönti, hogy prím-e vagy sem és ennek megfelelően `true` vagy `false` értékkel tér vissza. Aki már tart ott és tudja mit jelent a `static` az nyugodtan implementálhatja a metódust statikus metódusként. Az egyszerűség kedvért a prímeket most csak a pozitív egész számok körében értelmezzük, így __bónuszként__ rá lehet ellenőrizni, hogy `x>0`  és ha nem akkor kivételt dobni. Prímeknek tekintjük azokat számokat melyek csak egyel és önmagukkal oszthatók, tehát a `2`,`3`,`5`,`7`,`11`,`13` stb. _Teszt_!!

### Senior csoport mai feladata:

Készíts egy osztályt a `week07d01` csomagba `Fibonacci` néven. Legyen benne egy `fib` metódus, ami egy `int n` paramétert vár. A visszatérési értékünk legyen egy `long` szám, ami az `n`-edik fibonacci számot tartalmazza. (A fibonacci szám az az az előző kettő fibonacci szám összege és az első két szám az `1`, `1`.

__Bónusz feladat:__ implementáljuk az algoritmust ciklus nélkül és mentsük el a részeredményeket egy statikus változóba.

__Pontosítás:__ Ha `n = 0`, akkor `0`-t adunk vissza, ha `n=1`, akkor `1`-et, ezért lesz a `2`. elem szintén `1`, mert `0 + 1 = 1`