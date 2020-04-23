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

-- 位置
INSERT INTO `test_db`.`location` (`location_name`) VALUES ('下公館');
INSERT INTO `test_db`.`location` (`location_name`) VALUES ('葉媽');

-- 分配明細
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '1');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '1');

INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '2');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '2');

INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '3');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '3');

INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '4');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '4');

INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '5');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '5');

INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '6');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '6');

INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '7');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '7');

INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('1', '0', '8');
INSERT INTO `test_db`.`product_assign` (`location_id`, `quantity`, `type_id`) VALUES ('2', '0', '8');


SELECT A.series_name, B.product_name, B.inventory, B.unassigned, D.location_name, C.quantity, C.modify_date  
FROM test_db.product_series A, test_db.inventory_type B, test_db.product_assign C, test_db.location D
WHERE A.series_id = B.series_id 
AND B.type_id = C.type_id
AND C.location_id = D.location_id
ORDER BY A.series_id;