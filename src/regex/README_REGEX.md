# Regex Notes (Java) 🚀

A structured and spacious README based on your handwritten notes.

------------------------------------------------------------------------

# 1. What is Regex?

**Regex (Regular Expression)** is a pattern used to:

-   Search text
-   Match text
-   Validate input
-   Replace text

------------------------------------------------------------------------

# 2. Common Special Characters

  ------------------------------------------------------------------------
  Symbol         Meaning          Example          Description
  -------------- ---------------- ---------------- -----------------------
  `.`            Any one          `a.c`            Matches any single
                 character                         character

  `\d`           Digit            `\d`             Matches digits from
                                                   `0-9`

  `\D`           Not Digit        `\D`             Matches anything except
                                                   digits

  `\w`           Word Character   `\w+`            equivalent to [a-zA-Z0-9_] and w+ groups them together until space or other letters come

  `\W`           Not Word         `\W`             Opposite of `\w`
                 Character                         

  `\s`           Whitespace       `\s`             Space, tab, newline

  `\S`           Not Whitespace   `\S`             Opposite of `\s`

  `[abc]`        Character Class  `[abc]`          Match specific
                                                   characters

  `[^abc]`       Negation         `[^0-9]`         Match anything except
                                                   given characters

  `[A-Z]`        Range            `[A-Z]`          Match uppercase letters

  `[a-z]`        Range            `[a-z]`          Match lowercase letters

  `[0-9]`        Range            `[0-9]`          Match digits
  ------------------------------------------------------------------------

------------------------------------------------------------------------

# 3. Quantifiers

  -----------------------------------------------------------------------
  Quantifier             Meaning          Example          Output
  ---------------------- ---------------- ---------------- --------------
  `+`                    One or more      `a+`             `a`, `aa`,
                                                           `aaa`

  `*`                    Zero or more     `a*`             empty, `a`,
                                                           `aa`

  `?`                    Zero or one      `a?`             empty or `a`

  `{n}`                  Exact repetition `a{3}`           `aaa`

  `{min,max}`            Range repetition `a{2,5}`         `aa`, `aaa`,
                                                           `aaaa`,
                                                           `aaaaa`
  -----------------------------------------------------------------------

------------------------------------------------------------------------

# 4. Anchors

  Symbol   Meaning         Example
  -------- --------------- ----------
  `^`      Start of line   `^hello`
  `$`      End of line     `hello$`

Example:

``` regex
^hello$
```

Matches only:

``` text
hello
```

------------------------------------------------------------------------

# 5. OR Operator (`|`)

  Symbol   Meaning   Example
  -------- --------- -----------
  `|`      OR        `cat|dog`

Matches either:

``` text
cat
dog
```

------------------------------------------------------------------------

# 6. Grouping `()`

Used to group expressions together.

  Regex      Meaning
  ---------- ----------------------------------
  `(abc)+`   One or more repetitions of `abc`

Examples:

``` text
abc
abcabc
abcabcabc
```

------------------------------------------------------------------------

# 7. Escape Character `\`

Use `\` to escape special characters.

  Regex     Meaning
  --------- --------------------------
  `\.com`   Matches `.com` literally
  `a\.b`    Matches `a.b` literally

------------------------------------------------------------------------

# 8. Word Boundaries

## `\b` → Word Boundary

Matches start/end of a word.

Example:

``` regex
\bcat\b
```

Text:

``` text
cat cats concat
```

Output:

``` text
cat
```

------------------------------------------------------------------------

## `\B` → Negative Boundary

No word boundary.

Example:

``` regex
\Bcat\B
```

Text:

``` text
cat cats concatenation
```

Matches:

``` text
cat (inside another word)
```

------------------------------------------------------------------------

# 9. Greedy vs Lazy Matching

## Greedy Matching

Matches the **maximum** possible text.

  Regex      Result
  ---------- ---------------------
  `a+`       `aaaaaa`
  `a*`       Maximum `a`
  `a{2,5}`   Largest valid match

## Lazy Matching

Add `?` after quantifier.

  Regex       Result
  ----------- ----------------------
  `a+?`       `a`
  `a*?`       Minimum match
  `a{2,5}?`   Smallest valid match

Example Text:

``` text
aaaaaa
```

------------------------------------------------------------------------

# 10. Lookarounds

Lookarounds check text **without consuming characters**.

## Positive Lookahead `(?=...)`

Checks future text.

``` regex
\d(?=kg)
```

Matches digit only if followed by `kg`.

Example:

``` text
50kg
```

Output:

``` text
0
```

------------------------------------------------------------------------

## Negative Lookahead `(?!...)`

``` regex
\d(?!kg)
```

Matches digit NOT followed by `kg`.

------------------------------------------------------------------------

## Positive Lookbehind `(?<=...)`

Checks previous text.

``` regex
(?<=\$)\d+
```

Matches number only if preceded by `$`.

Example:

``` text
$100
```

Output:

``` text
100
```

------------------------------------------------------------------------

## Negative Lookbehind `(?<!...)`

``` regex
(?<!\$)\d+
```

Matches number NOT preceded by `$`.

------------------------------------------------------------------------

# 11. Capturing Groups

Used to store matched parts.

``` java
Pattern p = Pattern.compile("(\\w+)");
Matcher m = p.matcher("hello world");

while(m.find()){
    System.out.println(m.group(1));
}
```

  Group        Meaning
  ------------ --------------------
  `group(0)`   Entire regex match
  `group(1)`   First group
  `group(2)`   Second group

------------------------------------------------------------------------

# 12. Backreferences

Used to match text already captured.

Regex:

``` regex
(\w+)\s+\1
```

Meaning:

1.  Capture word
2.  Match same word again

Examples:

``` text
hello hello
cat cat
```

------------------------------------------------------------------------

# 13. Multiline Mode

Treats each line separately.

Without multiline:

``` regex
^hello
```

Only checks beginning of entire text.

With multiline:

Checks beginning of every line.

------------------------------------------------------------------------

# 14. DOTALL Mode

Normally:

``` regex
.
```

does NOT match newline.

With DOTALL:

`.` also matches newline (`\n`).

------------------------------------------------------------------------

# 15. Named Groups

Instead of numbers:

``` regex
(?<id>\d+)
```

Access using:

``` java
m.group("id");
```

------------------------------------------------------------------------

# 16. Regex Flags (Java)

  Flag                         Purpose
  ---------------------------- ---------------------
  `Pattern.CASE_INSENSITIVE`   Ignore case
  `Pattern.MULTILINE`          Multiline mode
  `Pattern.DOTALL`             Dot matches newline
  `Pattern.UNICODE_CASE`       Unicode support

Example:

``` java
Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
```

------------------------------------------------------------------------

# 17. Pattern Class

`Pattern` compiles regex.

Responsibilities:

1.  Parse regex
2.  Validate syntax
3.  Compile regex
4.  Apply flags

Example:

``` java
Pattern p = Pattern.compile("\\d+");
```

### Why use Pattern?

Avoid recompiling regex repeatedly.

------------------------------------------------------------------------

## Pattern Methods

  Method        Purpose
  ------------- -------------------------
  `compile()`   Compile regex
  `matcher()`   Create matcher
  `pattern()`   Return regex
  `flags()`     Return regex flags
  `quote()`     Escape regex characters

Example:

``` java
Pattern.quote("a.b")
```

Output:

``` text
a\.b
```

------------------------------------------------------------------------

# 18. Matcher Class

`Matcher` performs matching.

Matcher is **stateful**.

Stores:

1.  Current position
2.  Matched group
3.  Start index
4.  End index
5.  Input text
6.  Last match

------------------------------------------------------------------------

## Matcher Methods

  Method             Purpose
  ------------------ -------------------------
  `matches()`        Match entire string
  `find()`           Find next match
  `lookingAt()`      Match beginning
  `group()`          Return matched group
  `start()`          Start index
  `end()`            End index
  `reset()`          Reset matcher
  `replaceAll()`     Replace all matches
  `replaceFirst()`   Replace first match
  `groupCount()`     Total groups
  `hitEnd()`         Check end reached
  `requireEnd()`     Check more input needed

------------------------------------------------------------------------

# 19. Pattern vs Matcher

  Pattern          Matcher
  ---------------- -------------------
  Compiles regex   Performs matching
  Immutable        Stateful
  Reusable         Per input text

------------------------------------------------------------------------

# 20. Quick Summary

  Topic            Syntax
  ---------------- ------------
  Digit            `\d`
  Word Character   `\w`
  Space            `\s`
  Word Boundary    `\b`
  OR               `|`
  Group            `()`
  Lookahead        `(?=x)`
  Lookbehind       `(?<=x)`
  Backreference    `\1`
  Lazy Matching    `*?`, `+?`
  Start Anchor     `^`
  End Anchor       `$`
