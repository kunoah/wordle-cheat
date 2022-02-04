# Cheat At Wordle

Are you unable to win a fair game? Make it unfair! Amaze your friends and confound your enemies with your heretofore unsuspected linguistic brilliance. You can also demonstrate your clairvoyance by predicting solutions for future days. 

## Sample usage

```java
Solver solver = new Solver();
System.out.println(solver.cheat(LocalDate.of(2022, 2, 5)));
```

```
> aloft
```

## Notes

The list of future solutions is extracted from the current Wordle version as of `2022-02-03`. It could change; you might guess wrong. Wouldn't that be embarrassing!

## Miscellaneous observations
* The current Wordle word rotates at local midnight for the timezone of your computer, so people in different places will see different words at the same time.
* The Wordle word for the day is picked by rotating through a list of 2315 candidates. We will reach the end of the list on `2027-10-20`.
* On `2027-10-21`, the solution will reset to the first element of the list, "cigar."
