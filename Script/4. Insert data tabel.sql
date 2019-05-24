insert into user_data (user_name) values
('maudy'),
('dimas')

insert into [dbo].[modules] (module_name) values
('PromoCard'), 
('CategoryCard'),
('FlashSaleCard'),
('HistoryCard'),
('NewsCard')

insert into [dbo].[user_module] (module_order, id_module, id_user) values
('1', '1', '1'),
('2', '2', '1'),
('3', '3', '1'),
('4', '4', '1'),
('5', '5', '1'),
('1', '5', '2'),
('2', '4', '2'),
('3', '3', '2'),
('4', '2', '2'),
('5', '1', '2')
