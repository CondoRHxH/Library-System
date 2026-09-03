# Library System 

A console based **Library Management System** built in Java, using core OOP principles (abstraction, inheritance, polymorphism) to model a small library workflow: user accounts, book inventory, borrowing/returns, fines, and orders all persisted to flat files, no database required.

## Features

**Every user**
- Sign up (as Admin or Normal User) or log in with email + password
- View the full book catalog
- Search for a book by name

**Normal User**
- Place an order for a book (quantity + auto calculated price)
- Borrow a book (14-day borrowing period, one active borrow per book per user)
- Return a borrowed book
- Calculate the fine owed for a late return (50 Dh per day overdue)

**Admin**
- Add new books (name, author, publisher, shelf address, quantity, price, copies)
- Delete a book from the catalog
- View all placed orders for a given book
- Wipe all stored data (users, books, orders)

## Tech Stack

- **Language:** Java (JDK 21)
- **Paradigm:** Object-Oriented Programming — an `IOOperation` interface implemented by every menu action (`AddBook`, `BorrowBook`, `ReturnBook`, `Search`, …), with `admin` and `normalUser` extending an abstract `User` class
- **Persistence:** Plain text files (custom `<N/>` / `<NewX/>` delimited format) under a `data/` folder — no external database
- **Build system:** none (plain Eclipse Java project — see `.classpath` / `.project`)

## Project Structure

```
Library-System/
├── src/EndUsers/         # All source code (single package: EndUsers)
│   ├── main.java         # Entry point — login / sign-up menu
│   ├── User.java         # Abstract base class for accounts
│   ├── admin.java        # Admin role + menu
│   ├── normalUser.java   # Normal user role + menu
│   ├── database.java     # Reads/writes users, books, orders, borrowings to disk
│   ├── Book.java / Order.java / Borrowing.java   # Domain models
│   └── AddBook.java, ViewBooks.java, Search.java, BorrowBook.java,
│       ReturnBook.java, CalculateFine.java, PlaceOrder.java,
│       ViewOrders.java, DeleteBook.java, DeleteAllData.java, Exit.java
│                          # One class per menu action, all implementing IOOperation
├── bin/                  # Compiled .class output (Eclipse build output)
└── data/                 # Flat-file "database" (Users, Books, Orders, Borrowings)
```

## Getting Started

### Prerequisites
- JDK 21 (or update `.classpath` to match your installed JDK)
- Eclipse (recommended, since this is an Eclipse project) or any IDE/CLI that can compile a plain Java source tree

### Run it

**Option 1 : Eclipse**
1. `File → Import → Existing Projects into Workspace`, select the repo folder
2. Fix the data paths above
3. Run `main.java`

**Option 2 : Command line**
```bash
git clone https://github.com/CondoRHxH/Library-System.git
cd Library-System
javac -d bin src/EndUsers/*.java
java -cp bin EndUsers.main
```

## How data is stored

Each entity is serialized to a single line with `<N/>` as the field separator and a type-specific record separator (e.g. `<NewUser/>`, `<NewBook/>`), then written to its file in `data/`. On startup, `database` reads and re-parses these files back into in-memory lists (`ArrayList<User>`, `ArrayList<Book>`, etc.), so nothing is lost between runs.

## Known limitations

- File paths in `database.java` are hardcoded to a specific machine see above
- Book lookup (`getBook(name)`) matches by name only (no unique IDs), so duplicate titles can behave unexpectedly
- No input validation for menu choices in a couple of places (bad input can throw an exception)

Contributions and PRs to address any of the above are welcome.

## License

No license specified yet all rights reserved by default until one is added.
