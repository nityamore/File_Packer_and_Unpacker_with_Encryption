# File_Packer_and_Unpacker_with_Encryption
Java based file utility tool for packing and unpacking files with encryption

# 📦 File Packing and Unpacking with Encryption

A Java-based project that securely **packs multiple text files into a single file** and later **unpacks them back to their original format** using **XOR Encryption** for data security.
To enhance security, the packed file is encrypted, and only authorized users can decrypt and extract the data

---

## 📖 Project Overview

The **File Packing and Unpacking System with Encryption** is a command-line Java application designed to combine multiple `.txt` files into one packed file while encrypting the file contents.

The project consists of two main modules:

* **Packing Module** – Combines multiple files into a single packed file after encrypting the data.
* **Unpacking Module** – Extracts and decrypts files from the packed file to restore the original content.

This project demonstrates practical implementation of **File Handling, Data Security, Streams, and Encryption in Java**.

---

## ✨ Features

* Pack multiple `.txt` files into a single file
* Encrypt file content during packing
* Decrypt file content during unpacking
* Restore original file names and content
* Fixed-size header implementation (100 bytes)
* Command-line execution
* Efficient file handling using buffers
* Secure file transfer using XOR encryption

---

## 🛠️ Technologies Used

| Technology         | Purpose                   |
| ------------------ | ------------------------- |
| Java               | Core Programming Language |
| FileInputStream    | Reading file data         |
| FileOutputStream   | Writing file data         |
| Scanner Class      | User input handling       |
| XOR Encryption     | Data security             |
| Byte Buffer        | Efficient file transfer   |
| Exception Handling | Error management          |

---

## 📂 Project Structure

```text
File-Packing-Unpacking/
│── Packing.java          # Packing module
│── Unpacking.java        # Unpacking module
│── README.md             # Documentation
│── InputFolder/          # Folder containing text files
│── packed.txt            # Generated packed file
```

---

## ⚙️ How It Works

### 1️⃣ Packing Process

The packing module combines multiple `.txt` files into a single packed file while encrypting the data.

### Process Flow

```text
Folder Files
      ↓
Read File
      ↓
Create Header (Name + Size)
      ↓
Encrypt Data (XOR)
      ↓
Write to Packed File
      ↓
Packed File Created
```

### Steps Involved

1. User enters the **folder name**.
2. User enters the **packed file name**.
3. Program checks whether the folder exists.
4. Reads all `.txt` files inside the folder.
5. Creates a **100-byte header** containing:

   * File Name
   * File Size
6. Reads file data using a buffer.
7. Encrypts the data using XOR operation.
8. Stores encrypted data inside the packed file.

---

### 2️⃣ Unpacking Process

The unpacking module extracts and decrypts files from the packed file.

### Process Flow

```text
Packed File
      ↓
Read Header
      ↓
Extract File Name & Size
      ↓
Read Encrypted Data
      ↓
Decrypt Data (XOR)
      ↓
Restore Original File
```

### Steps Involved

1. User enters the packed file name.
2. Program reads the **100-byte header**.
3. Extracts:

   * File Name
   * File Size
4. Reads encrypted file content.
5. Decrypts data using XOR encryption.
6. Creates original files.
7. Writes decrypted content into restored files.

---

## 🔐 Encryption Technique

This project uses **XOR Encryption** for securing file data.

### Encryption Key

```java
byte Key = 0x11;
```

### Encryption Formula

```text
Encrypted Data = Original Data XOR Key
```

### Decryption Formula

```text
Original Data = Encrypted Data XOR Key
```

Since XOR is a **reversible operation**, applying the same key again restores the original content.

### Example

```text
Character = A
ASCII Value = 65
Key = 17

Encryption:
65 XOR 17 = Encrypted Value

Decryption:
Encrypted Value XOR 17 = 65
```

---

## 🚀 How to Run the Project

### ▶️ Run Packing Module

### Step 1: Compile

```bash
javac Packing.java
```

### Step 2: Execute

```bash
java Packing
```

### Sample Input

```text
Enter the name of folder:
InputFolder

Enter the name of packed file:
packed.txt
```

### Sample Output

```text
Folder is present
Number of files in the folder are : 3
```

---

### ▶️ Run Unpacking Module

### Step 1: Compile

```bash
javac Unpacking.java
```

### Step 2: Execute

```bash
java Unpacking
```

### Sample Input

```text
Enter the name of packed file:
packed.txt
```

### Sample Output

```text
File Name : notes.txt
File size : 120

File Name : data.txt
File size : 80
```

---

## 📌 Sample Output Structure

### Before Packing

```text
InputFolder/
│── notes.txt
│── data.txt
│── info.txt
```

### After Packing

```text
packed.txt
```

### After Unpacking

```text
notes.txt
data.txt
info.txt
```

All original files are restored successfully.

---

## 💡 Concepts Used

This project implements the following Java concepts:

* File Handling
* File Streams
* Scanner Class
* Byte Buffer
* XOR Encryption
* Header Management
* String Manipulation
* Exception Handling
* Array Handling
* Command Line Execution

---

## 🎯 Learning Outcomes

Through this project, the following concepts can be learned:

* Understanding file packing and unpacking mechanisms
* Working with file streams in Java
* Implementing encryption and decryption logic
* Managing multiple files using headers
* Using buffers for optimized file transfer
* Applying real-world Java file handling concepts

---

## 🔮 Future Enhancements

The project can be enhanced with:

* Support for all file types (`.pdf`, `.jpg`, `.png`, `.docx`)
* Password-protected encryption
* AES encryption for better security
* GUI interface using Swing/JavaFX
* File compression support
* Multi-folder packing support
* Improved logging and exception handling

---

## 👨‍💻 Author

* **Name:** Nitya Rajesh More
* **Project:** File Packing and Unpacking with Encryption
* **Language:** Java

---

⭐ If you found this project useful, consider giving it a star!

