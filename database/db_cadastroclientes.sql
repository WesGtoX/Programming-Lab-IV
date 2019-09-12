--
-- DATABASE 'cadastro_clientes'
--

-- create table 'tb_cliente'
CREATE TABLE tb_cliente (
    id SERIAL PRIMARY KEY,
    nome varchar(255) default NULL,
    telefone varchar(100) default NULL,
    email varchar(255) default NULL,
    ativo boolean
);


-- create table 'tb_usuario'
CREATE TABLE tb_usuario (
    id SERIAL PRIMARY KEY,
    login varchar(100),
    senha varchar(32),
    ativo boolean
);




SELECT * FROM tb_usuario WHERE login='joao' AND senha=MD5('1234567');

SELECT * FROM tb_usuario;
SELECT * FROM tb_cliente;

INSERT INTO tb_usuario (login,senha,ativo) VALUES ('wesley',MD5('123'), 'true');
INSERT INTO tb_usuario (login,senha,ativo) VALUES ('joao',MD5('123456'),'true');
INSERT INTO tb_usuario (login,senha,ativo) VALUES ('jose',MD5('password'),'true');


INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Jana Conner','33-27176-1680','est.ac.facilisis@nec.net','true'),('Lucian Aguirre','57-57737-1394','non@egetdictumplacerat.edu','true'),('Genevieve Haney','44-97721-8412','Vestibulum@malesuada.com','true'),('Martha Lopez','10-47841-7060','dolor.nonummy.ac@bibendum.net','true'),('Geoffrey Stevenson','60-30923-8722','amet.risus.Donec@necmollis.net','true'),('Hakeem Walls','47-93017-4600','adipiscing.ligula.Aenean@facilisiSedneque.edu','true'),('Addison Chapman','25-15980-4958','lectus.sit.amet@Phasellusdapibus.net','true'),('Suki Guthrie','76-99031-9844','litora.torquent@Pellentesqueutipsum.ca','true'),('Leroy George','33-97182-0413','pede@nibhdolor.co.uk','true'),('Kimberly Sykes','60-83323-1667','at@pedeCumsociis.co.uk','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Dexter Harding','57-93068-1917','ultricies.ornare.elit@non.net','true'),('Stella Faulkner','00-70086-0131','ut.cursus.luctus@elit.net','true'),('Glenna Hebert','37-59801-2768','in@variuseteuismod.org','true'),('Ethan Greer','55-79057-7712','at.fringilla.purus@ullamcorpernisl.com','true'),('Isabelle Drake','13-28446-6348','Donec.consectetuer.mauris@vulputatedui.org','true'),('Signe Vasquez','04-54514-6735','condimentum.Donec@ornareIn.net','true'),('Aquila Olson','28-66855-5654','urna@egetmetuseu.edu','true'),('Michael Ryan','52-39381-8079','magna.Cras@metusurnaconvallis.ca','true'),('Isaiah Sawyer','46-29327-9880','tempus@accumsaninterdum.com','true'),('Armand Livingston','33-37437-5594','tincidunt@cursus.net','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Alfonso Giles','07-31370-3855','posuere@Donec.edu','true'),('Fatima Carlson','18-68669-8999','hendrerit.Donec@Sednunc.ca','true'),('Oren Ramirez','29-50548-6200','commodo.at.libero@gravida.org','true'),('Orlando Dudley','27-76951-1274','eu.metus.In@lacuspedesagittis.com','true'),('Lareina Wallace','63-47041-0281','ornare.tortor.at@Donecat.net','true'),('Tashya Meyers','52-81316-8378','Quisque.libero.lacus@lacus.co.uk','true'),('William Hogan','27-95410-5763','Proin.non.massa@sagittisfelis.com','true'),('Thomas Chase','86-33373-1716','tempus.risus@lobortis.co.uk','true'),('Rinah Roberts','65-98630-2982','egestas.Aliquam.nec@velturpis.org','true'),('Ayanna Jimenez','62-83324-5097','ac.eleifend.vitae@Etiam.ca','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Hamilton Burnett','67-96219-6036','ut.pharetra.sed@nisi.edu','true'),('Darrel Silva','52-12699-8656','luctus.felis.purus@amet.net','true'),('Blaine Andrews','94-56996-2410','ornare.elit.elit@aliquet.net','true'),('Jamal Hoffman','92-82868-8586','sed@eunequepellentesque.org','true'),('Brennan Paul','22-52320-1946','ac.ipsum.Phasellus@convallis.ca','true'),('Mechelle Vincent','03-52551-1331','augue.id@ipsum.ca','true'),('Arden Mcguire','63-35967-8735','ac.libero@sitamet.org','true'),('Leilani Andrews','89-46479-5549','Vivamus@auctor.net','true'),('Eaton Delaney','23-19542-4862','Nunc@penatibus.edu','true'),('Flavia Hinton','18-14065-9101','vitae.purus.gravida@eratvolutpatNulla.net','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Hammett Hale','73-27681-6337','nulla.Integer.urna@vulputatedui.net','true'),('Clio Nunez','16-52492-5732','ornare@egestasurna.co.uk','true'),('Tamara Cote','78-80286-7170','risus.a.ultricies@pellentesquemassalobortis.edu','true'),('Miriam Colon','46-90346-2733','Nulla.tincidunt@Sednecmetus.net','true'),('Kibo Steele','90-83142-3100','Etiam@sapienCras.net','true'),('Phillip Sanders','44-47507-5089','amet.metus@interdumNuncsollicitudin.ca','true'),('Ayanna Ferguson','28-26931-8457','non.egestas@auctor.org','true'),('Aiko Sims','70-77721-3569','Vivamus.non@nisisemsemper.org','true'),('Minerva Riggs','41-35890-0973','In@mollisPhaselluslibero.co.uk','true'),('Cole Sullivan','40-63849-8897','amet@mus.edu','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Kermit Matthews','65-15940-9207','ac.fermentum.vel@lacus.org','true'),('Matthew Bradley','35-50047-7394','Quisque.nonummy.ipsum@eleifend.net','true'),('Jessica Hendrix','06-90446-5765','faucibus.orci@aaliquetvel.org','true'),('Lani Glover','28-12761-0466','In@veliteusem.net','true'),('Sebastian Kirkland','55-39121-9521','accumsan@porttitorscelerisqueneque.com','true'),('Jonas Miller','91-57478-4967','enim.non.nisi@nuncnullavulputate.net','true'),('Allen Hahn','08-56225-0834','blandit@felis.com','true'),('Axel Ray','29-48076-9183','nonummy.ipsum.non@sed.com','true'),('Brandon Bradford','60-26449-5643','lobortis.nisi@CuraePhasellus.co.uk','true'),('Bevis Henderson','23-10267-1145','lacus.Nulla.tincidunt@a.com','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Jasmine Schneider','15-55141-1712','nonummy@blanditviverra.co.uk','true'),('Jason Dominguez','42-83616-5488','pede@nonenim.com','true'),('Mohammad Horne','52-59902-6811','elit@egestasligulaNullam.org','true'),('Raja Martin','39-64950-2017','aliquet.Proin.velit@pharetra.edu','true'),('Ocean Wilder','82-69452-4319','nisl.arcu@etnunc.edu','true'),('Andrew Dale','00-96283-0715','Maecenas@Sedpharetrafelis.com','true'),('Larissa Malone','10-12087-9885','diam.lorem.auctor@mus.com','true'),('Grant Whitehead','82-37530-3017','eu.metus@luctus.org','true'),('Wanda Mcgowan','82-22317-7444','condimentum.Donec@sagittis.net','true'),('Lane Garner','93-35559-4155','et.malesuada@Curabiturdictum.org','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Ayanna Brock','44-77794-0875','tristique.ac@aliquetmetus.edu','true'),('Dominique Lester','99-86870-1238','sem.magna.nec@arcuSedet.net','true'),('Marny Thomas','10-20767-4792','Cum.sociis.natoque@nunc.net','true'),('Felix Macias','79-23190-2038','Cras@accumsansed.edu','true'),('Jessamine Murray','94-76278-9935','est.Nunc.ullamcorper@Donec.com','true'),('Orla Spencer','49-33750-5630','lacus@adipiscingelit.ca','true'),('Len Wynn','86-29126-2224','cursus@Mauriseu.com','true'),('Tucker Hale','08-19722-4024','purus.accumsan@risusDonec.com','true'),('Ann Davenport','01-82048-9986','imperdiet@FuscemollisDuis.co.uk','true'),('Jakeem Mays','45-40504-9861','Donec@lectus.org','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Harding Leblanc','10-65661-9540','sociis@estarcu.edu','true'),('Sarah Myers','48-27794-3490','tellus.non@convallisante.co.uk','true'),('Breanna Simon','04-86613-5337','pharetra.Quisque.ac@neccursus.edu','true'),('Robert Cote','97-98544-4796','iaculis.lacus@lobortisaugue.org','true'),('Galvin Small','72-20814-5950','sed.dui@hendrerit.ca','true'),('Cole Hansen','29-83647-5284','Nam.interdum@Proinsedturpis.edu','true'),('Halee Poole','36-80965-8341','aliquam@tortorNunccommodo.com','true'),('Robert Bray','62-98785-4210','in.lobortis@telluseu.org','true'),('Alvin Rosario','47-16706-7795','sit.amet.massa@lectusCum.org','true'),('Ginger Cabrera','50-74049-4151','malesuada.vel@porttitor.edu','true');
INSERT INTO "tb_cliente" (nome,telefone,email,ativo) VALUES ('Russell Chapman','46-40176-2853','congue.In.scelerisque@ipsumdolor.org','true'),('Piper Bass','02-29843-9445','lacinia.orci.consectetuer@sodales.edu','true'),('Catherine Rodriguez','60-21804-0917','risus@Nullamut.org','true'),('Helen Sandoval','93-49705-6325','nulla@Innecorci.ca','true'),('Rafael Fleming','16-69603-4361','magnis.dis@Sed.net','true'),('Hector Walton','02-56301-6287','cubilia.Curae@aliquetPhasellusfermentum.com','true'),('Blake Howell','42-11215-4168','diam.nunc@vitaesodalesnisi.net','true'),('David Combs','13-74618-5376','orci.lobortis.augue@vitaesodales.org','true'),('Caleb Gonzales','01-82074-9731','conubia@egestasa.edu','true'),('Burton Calderon','86-71986-1005','blandit.enim@ornaretortor.org','true');
