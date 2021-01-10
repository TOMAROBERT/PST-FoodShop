INSERT INTO `projpst`.`foodorder`
(`OrderID`,
`Produse`,
`Cantitate`)
VALUES
(1,
"pizza,paste,suc",
3),
(2,
"pizza,bere,burger",
3),
(3,
"ciorba,spanac",
2);
INSERT INTO `projpst`.`foodmenu`
(`FoodID`,
`DenumireProd`,
`Ingrediente`,
`Pret`,
`foodOrder_OrderID`)
VALUES
(8,
"spanac",
"spanac,usturoi",
7,
3);
select * from foodmenu;


