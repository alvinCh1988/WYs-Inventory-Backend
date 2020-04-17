-- 系列
INSERT INTO `test_db`.`product_series` (`orders`, `series_color`, `series_name`) VALUES ('0', '#00c3ff', '發光肌');
INSERT INTO `test_db`.`product_series` (`orders`, `series_color`, `series_name`) VALUES ('1', '#00ff0d', '水潤光');

-- 庫存狀態
INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '健康水噴霧', '1', '2');
INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '油水平衡露', '1', '2');
INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '早安精華', '1', '2');
INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '晚安精華', '1', '2');

INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '保濕露', '2', '2');
INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '保濕日精華', '2', '2');
INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '保濕夜精華', '2', '2');
INSERT INTO `test_db`.`inventory_type` (`icon`, `inventory`, `modify_date`, `orders`, `product_name`, `series_id`, `unassigned`) VALUES ('thumbs-up', '5', '2020/04/17', '0', '保濕水凝乳', '2', '2');

-- 分配明細
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '1');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '1');

INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '2');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '2');

INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '3');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '3');

INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '4');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '4');

INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '5');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '5');

INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '6');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '6');

INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '7');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '7');

INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('下公館', '2', '8');
INSERT INTO `test_db`.`product_assign` (`location`, `quantity`, `type_id`) VALUES ('葉媽', '1', '8');


SELECT A.series_name, B.product_name, B.inventory, B.unassigned, C.location, C.quantity, C.modify_date  
FROM test_db.product_series A, test_db.inventory_type B, test_db.product_assign C 
WHERE A.series_id = B.series_id 
AND B.type_id = C.type_id
ORDER BY A.series_id;