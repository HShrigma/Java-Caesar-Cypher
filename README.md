# Java Caesar Cypher *(Java Console App)*

This is a beginner-friendly **Caesar Cipher** program written in Java that allows users to encrypt or decrypt messages using a numeric key. It's designed with user interaction in mind via the command line, and includes safe input handling for a smoother experience.

This is also mostly a learning exercise for me as I'm getting used to Java syntax. 
---

## 💡 What it Does

- Prompts the user to enter their **name**
- Requires entry of a secret code (`245`) before proceeding
- Asks for a cipher **key** (an integer)
- Lets the user choose to either:
  - **Encrypt** a message
  - **Decrypt** a message
- Displays the result using a simple Caesar Cipher logic (shift each character by the key)

---

## 🔐 What's a Caesar Cipher?

The Caesar Cipher is one of the simplest and most well-known encryption techniques. Each character in the input text is shifted by a fixed number of positions based on the key provided.

Example with key `+2`:  
`A` → `C`, `B` → `D`, `C` → `E`, and so on.

This implementation does **not** limit the encryption to letters only — it shifts *all* characters, including symbols and punctuation.

Note: Keep in mind, this isn't bug-free, i.e. your encrypted character lands on *DEL*, you're automatically losing it. This could be mitigated by restricting permutations to only [a-z],[A-Z] characters using regex or modulo indexing, but again - this was more of a syntax muscle memory exercise that I decided to publish and less of a solution to any issue. 
---

## 🛠️ How to Run

1. Make sure you have Java installed (version 8+ is fine).
2. Compile and run the program:

```bash
javac Main.java
java Main