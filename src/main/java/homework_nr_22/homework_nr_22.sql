CREATE TABLE Books (
    book_id SERIAL PRIMARY KEY,
    name TEXT,
    author TEXT,
    date_of_publishing DATE,
    genre TEXT,
    available_count INT
);

INSERT INTO Books (name, author, date_of_publishing, genre, available_count)
VALUES
    ('The Great Gatsby', 'F. Sco^ Fitzgerald', '1925-01-01', 'Classics', 3),
    ('To Kill a Mockingbird', 'Harper Lee', '1960-01-01', 'Fiction', 5),
    ('1984', 'George Orwell', '1949-01-01', 'Science Fiction', 2),
    ('Pride and Prejudice', 'Jane Austen', '1813-01-01', 'Romance', 4);

select*from Books;