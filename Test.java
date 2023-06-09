-- Create the Product table
CREATE TABLE Product (
  PdtId INT PRIMARY KEY,
  Pname VARCHAR(50),
  Price DECIMAL(10, 2),
  QtyInStock INT
);

-- Create the Sale table
CREATE TABLE Sale (
  SaleId INT PRIMARY KEY,
  DeliveryAddress VARCHAR(100)
);

-- Create the Saleitem table
CREATE TABLE Saleitem (
  SaleId INT,
  PdtId INT,
  Qty INT,
  FOREIGN KEY (SaleId) REFERENCES Sale(SaleId),
  FOREIGN KEY (PdtId) REFERENCES Product(PdtId)
);

-- Create the updateAvailableQuantity trigger
CREATE TRIGGER updateAvailableQuantity
AFTER INSERT ON Saleitem
FOR EACH ROW
BEGIN
  UPDATE Product
  SET QtyInStock = QtyInStock - NEW.Qty
  WHERE PdtId = NEW.PdtId;
END;
