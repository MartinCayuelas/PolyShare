-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  Dim 20 jan. 2019 à 19:15
-- Version du serveur :  5.7.24-0ubuntu0.18.04.1
-- Version de PHP :  7.2.10-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `dolcevitechdb`
--
CREATE DATABASE IF NOT EXISTS `dolcevitechdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `dolcevitechdb`;

-- --------------------------------------------------------

--
-- Structure de la table `Activite`
--

CREATE TABLE `Activite` (
  `idActivite` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `regles` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Activite`
--

INSERT INTO `Activite` (`idActivite`, `nom`, `regles`) VALUES
(2, 'Lancer de noyaux', '3 pts par mètre'),
(3, 'Peche a la ligne', '3 pts par canard'),
(5, 'Chorégraphie', '20 pts pour la participation'),
(7, 'Défi du petit lu', '5 pts pour la particitpation, 10 pts pour le premier tour, 20 pts pour la victoire'),
(9, 'Quizz', '5 pts par bonne réponse'),
(10, 'Pinata', '5 pts pour la participation, 10 pts si pinata cassée'),
(11, 'Roulette', '0 pts pour la participation, 15 pts si tombe sur la bonne part de la roue.'),
(12, 'Bière Pong', '10 pts pour la victoire, 5 pts pour la participation'),
(13, 'Tour de pise', '1 pts / 10cm avant 1m puis 1 pts / 5 cm après 1 mètre'),
(14, 'Jeux en bois ou gonflables', '5 pts par participation');

-- --------------------------------------------------------

--
-- Structure de la table `defis`
--

CREATE TABLE `defis` (
  `idDefi` int(11) NOT NULL,
  `intituleDefi` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `defis`
--

INSERT INTO `defis` (`idDefi`, `intituleDefi`) VALUES
(1, 'Étaler de la crème solaire'),
(2, 'Chanter c\'est un beau roman'),
(3, 'Avoir la signature sur du PQ'),
(4, 'Obtenir le numéro de téléphone'),
(5, 'Faire un signe italien avec la main'),
(6, 'Se faire payer un truc à l\'espace'),
(7, 'Chanter du Vianney'),
(8, 'Participer et gagner une activité'),
(9, 'Participer et perdre une activité'),
(10, 'Obtenir un bisou'),
(11, 'Lui faire dire j\'aime la Shuritech'),
(12, 'Lui faire imiter l\'autruche'),
(13, 'Le faire twerker'),
(14, 'Le piéger en canular téléphonique'),
(15, 'Avoir le nom de la mère'),
(16, 'Avoir le nom du père'),
(17, 'Avoir la pointure'),
(18, 'Se faire payer un coup'),
(19, 'Faire boire une cuillère d\'huile d\'olive'),
(20, 'Faire manger une moutarde du CROUS'),
(21, 'Se faire inviter chez un listeux'),
(22, 'Le faire manger sans les mains'),
(23, 'Recevoir une déclaration d\'amour/amitié'),
(24, 'Le faire jongler / marcher sur une slackline'),
(25, 'Échanger un vêtement'),
(26, 'Le faire marcher avec un objet sur la tête'),
(27, 'Faire un selfie'),
(28, 'Lui faire dire les noms et prénoms de 5 personnalités italiennes'),
(29, 'Faire boire un café cul-sec'),
(30, 'Lui faire manger un poivron entier cru'),
(31, 'Lui faire manger des feuilles de basilic'),
(32, 'Lui faire faire un avion en papier d\'une seule main'),
(33, 'Écrire dans le cou'),
(34, 'Monter sur le dos'),
(35, 'Le défier au babyfoot'),
(36, 'Lui écrire Shuritech sur le front'),
(37, 'Se faire masser'),
(38, 'Le masser'),
(39, 'Lui faire porter un vêtement à l\'envers pendant 3h'),
(40, 'Lui faire gober un flamby'),
(41, 'Lui faire imiter un animal'),
(42, 'Mettre un objet dans sa poche et lui demander plus tard'),
(43, 'Lui faire porter des goodies Shuritech'),
(44, 'Manger au RU avec'),
(45, 'Se faire inviter à la triloc'),
(46, 'Se faire faire un clin d\'oeil'),
(47, 'Lui couper les cheveux'),
(48, 'Lui arracher un poil'),
(49, 'Le maquiller'),
(50, 'Lui lécher le coude'),
(51, 'Lui faire manger de la pâte à pizza crue'),
(52, 'Lui faire manger 50g de pâtes crues'),
(53, 'Lui faire porter des tongs'),
(54, 'Lui faire manger une cuillère de pesto'),
(55, 'Lui mettre du vernis'),
(56, 'Lui faire faire du sport'),
(57, 'Lui faire embrasser tes pieds'),
(58, 'Lui brosser les dents'),
(59, 'Lui faire répéter 6 fois une phrase'),
(60, 'Lui faire écrire un poème'),
(61, 'Lui faire écrire une lettre'),
(62, 'Lui faire 3x la bise en soirée'),
(63, 'Lui faire tenir un spaghetti sur la tête'),
(64, 'L\'appeler par un autre prénom sans qu\'il te reprenne '),
(65, 'Gagner un pierre/feuille/ciseaux 3 à 0'),
(66, 'Convaincre la personne de rejoindre ta secte qui t’interdis de boire de l’alcool les jours impairs'),
(67, 'Lui offrir un collier de pates qu’il doit porter devant toi'),
(68, 'Lui servir 3 fois un verre et qu’il les boive'),
(69, 'Lui faire signer une pétition ridicule'),
(70, 'Gagner à « je te tiens par la barbichette »'),
(71, 'Lui accrocher 5 pinces à linge'),
(72, 'Faire énoncer le théorème de Pythagore'),
(73, 'Lui lécher la joue'),
(74, 'Lui faire essayer de se lécher le coude'),
(75, 'Lui faire un point sur un orteil'),
(76, 'Lui faire embrasser quelqu’un'),
(77, 'Lui faire finir une de tes phrases'),
(78, 'Lui faire chanter une chanson la bouche pleine'),
(79, 'Mettre un vêtement à l’envers'),
(80, 'Lui faire mettre des chaussettes sur les mains'),
(81, 'Lui faire danser la macarena sur une autre chanson'),
(82, 'Le convaincre de te porter (ou te faire porter)'),
(83, 'Lui faire faire dix tours sur lui même avec un balais'),
(84, 'Lui faire faire la macarena à l’envers'),
(85, 'Lui faire réciter les trois premières phrases de l’étiquette Ricard'),
(86, 'Le faire passer sous une table'),
(87, 'Lui faire marcher une dizaine de mètres à 4 pattes'),
(88, 'Lui faire fermer les yeux'),
(89, 'Lui faire enlever ses chaussures'),
(90, 'Le faire courir à l’envers'),
(91, 'Lui faire ouvrir une fenêtre'),
(92, 'Le faire parler en rimes pendant quelques minutes'),
(93, 'Lui faire faire le moon walk'),
(94, 'Fais lui dessiner une pizza les yeux bandés '),
(95, 'Fais le danser avec la mascotte '),
(96, 'Lui faire réciter l’alphabet à l’envers'),
(97, 'Le faire sauter à cloche pieds'),
(98, 'Le faire s’asseoir sur tes genoux '),
(99, 'Fais lui dire la date (jour/mois/année) et le lieu où vous êtes');

-- --------------------------------------------------------

--
-- Structure de la table `Droit`
--

CREATE TABLE `Droit` (
  `idDroit` int(11) NOT NULL,
  `intitule` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Droit`
--

INSERT INTO `Droit` (`idDroit`, `intitule`) VALUES
(1, 'Tout les droits'),
(3, 'Ajouter des pizzas coins'),
(5, 'Verification du killer'),
(7, 'Monitoring activites');

-- --------------------------------------------------------

--
-- Structure de la table `Jeux`
--

CREATE TABLE `Jeux` (
  `nom` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Jeux`
--

INSERT INTO `Jeux` (`nom`) VALUES
('Snake'),
('Doddle'),
('Flappy');

-- --------------------------------------------------------

--
-- Structure de la table `Membre`
--

CREATE TABLE `Membre` (
  `idMembre` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `section` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Membre`
--

INSERT INTO `Membre` (`idMembre`, `nom`, `prenom`, `section`) VALUES
(1, 'Samson', 'Audrey', 'ig'),
(2, 'Guary', 'Nicolas', 'ig'),
(3, 'StLeger', 'Alessandra', 'gba'),
(4, 'Paire', 'Laurent', 'egc'),
(5, 'Lopez', 'Solenn', 'egc'),
(6, 'Boucard', 'Anais', 'gba'),
(7, 'Hoareau', 'Camille', 'gba'),
(8, 'Loiseleux', 'Camille', 'gba'),
(9, 'Hubert', 'Claire', 'gba'),
(10, 'Perez', 'Emily', 'gba'),
(11, 'Guillot', 'Lysiane', 'gba'),
(12, 'Laurent', 'Oriane', 'gba'),
(13, 'Mellah', 'Ilias', 'ig'),
(14, 'Roumagnac', 'Julien', 'ig'),
(15, 'Debeir', 'Luca', 'ig'),
(16, 'Mas', 'Lucas', 'ig'),
(17, 'Danner', 'MA', 'ig'),
(18, 'Traineau', 'Nathan', 'ig'),
(19, 'Guary', 'Nicolas', 'ig'),
(20, 'France', 'Quentin', 'ig'),
(21, 'Gayet', 'Simon', 'ig'),
(22, 'Ponthieu', 'Theo', 'ig'),
(23, 'Berassen', 'Andrea', 'mat'),
(24, 'Miodowski', 'Arthur', 'mat'),
(25, 'Bourelly', 'Audrey', 'mat'),
(26, 'Hilaire', 'Bastien', 'mat'),
(27, 'Signorino', 'Hugo', 'mat'),
(28, 'Schmitt', 'Louis', 'mat'),
(29, 'Boussiere', 'Marjorie', 'mat'),
(30, 'Conan', 'Mathilde', 'mat'),
(31, 'Yansly', 'Mehdi', 'mat'),
(32, 'Gaillard', 'Nicolas', 'mat'),
(33, 'Bantula', 'Paul', 'mat'),
(34, 'Gardeux', 'Salome', 'mat'),
(35, 'Verquin', 'Simon', 'mat'),
(36, 'Saxod', 'Thomas', 'mat'),
(37, 'Fernandes', 'Tony', 'mat'),
(38, 'Chanu', 'Benjamin', 'mea'),
(39, 'Bignon', 'Agathe', 'mi'),
(40, 'Prudhomme', 'Andrea', 'mi'),
(41, 'Savouret', 'Lea', 'mi'),
(42, 'Collinet', 'Loic', 'mi'),
(43, 'Demars', 'Paul', 'mi'),
(44, 'Robert', 'Thomas', 'mi'),
(45, 'DeChavigny', 'Victor', 'mi'),
(46, 'Pradier', 'Yvan', 'mi'),
(47, 'Filloux', 'Alixia', 'peip'),
(48, 'Sery', 'Angele', 'peip'),
(49, 'Vivien', 'Antoine', 'peip'),
(50, 'Ginestet', 'Claire', 'peip'),
(51, 'Teyssonieres', 'Laure', 'peip'),
(52, 'Pennecot', 'Lea', 'peip'),
(53, 'Nicolai', 'Loick', 'peip'),
(54, 'Castelle', 'Thibaud', 'peip'),
(55, 'Vigne', 'Vincent', 'peip'),
(56, 'Dorazio', 'Alicia', 'peip'),
(57, 'Polleti', 'Clemence', 'ste'),
(58, 'Chalons', 'Elodie', 'ste'),
(59, 'Gadhano', 'Sophie', 'ste'),
(60, 'victoria', '', 'IG'),
(61, 'verso', '', 'IG'),
(62, 'sabrina', '', 'IG'),
(63, 'recto', '', 'IG'),
(64, 'pauline', '', ''),
(65, 'pandactu', '', ''),
(66, 'mickael', '', ''),
(67, 'johson', '', ''),
(68, 'johnny', '', ''),
(69, 'gaspard', '', ''),
(70, 'fanboy', '', ''),
(71, 'bryan', '', ''),
(72, 'billy', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `Possede`
--

CREATE TABLE `Possede` (
  `idMembre` int(11) NOT NULL,
  `idUser` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ProposeSecret`
--

CREATE TABLE `ProposeSecret` (
  `idSecret` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `idMembre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ProposeSecret`
--

INSERT INTO `ProposeSecret` (`idSecret`, `idUser`, `idMembre`) VALUES
(1, 31, 4),
(2, 31, 3),
(3, 31, 5),
(4, 31, 16),
(5, 31, 9),
(6, 31, 7);

-- --------------------------------------------------------

--
-- Structure de la table `Realise`
--

CREATE TABLE `Realise` (
  `idUser` int(11) NOT NULL,
  `meilleurScore` int(11) NOT NULL,
  `nomJeux` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Realise`
--

INSERT INTO `Realise` (`idUser`, `meilleurScore`, `nomJeux`) VALUES
(31, 18, 'Flappy'),
(35, 1, 'Flappy'),
(35, 1, 'Flappy'),
(31, 1548, 'Doodle');

-- --------------------------------------------------------

--
-- Structure de la table `RealiseActivite`
--

CREATE TABLE `RealiseActivite` (
  `idActivite` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `nbParticipation` int(11) NOT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `RealiseActivite`
--

INSERT INTO `RealiseActivite` (`idActivite`, `idUser`, `nbParticipation`, `score`) VALUES
(2, 31, 1, 2),
(9, 31, 1, 120);

-- --------------------------------------------------------

--
-- Structure de la table `RealiserDefi`
--

CREATE TABLE `RealiserDefi` (
  `idMembre` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `idDefi` int(11) NOT NULL,
  `estTerminer` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `RealiserDefi`
--

INSERT INTO `RealiserDefi` (`idMembre`, `idUser`, `idDefi`, `estTerminer`) VALUES
(3, 31, 3, 1),
(2, 32, 2, 1),
(2, 33, 5, 1),
(7, 34, 3, 1),
(27, 31, 57, 1),
(22, 31, 85, 1),
(2, 31, 58, 1),
(3, 31, 5, 1),
(30, 31, 71, 1);

-- --------------------------------------------------------

--
-- Structure de la table `RecompensesActi`
--

CREATE TABLE `RecompensesActi` (
  `idRecompense` int(11) NOT NULL,
  `place` int(11) NOT NULL,
  `prix` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `RecompensesActi`
--

INSERT INTO `RecompensesActi` (`idRecompense`, `place`, `prix`) VALUES
(1, 21, 'Masque de mousse à raser fait par Arthur Miodo'),
(2, 22, 'Une formule à Pitaya'),
(3, 24, 'Une pizza au HousePizza'),
(4, 27, 'Un bon pour une glace chez Dino'),
(5, 29, 'Un bon Häägen dazs'),
(6, 32, 'Entrée paintball, Archery, Laser'),
(7, 33, 'Une entrée rebound world'),
(8, 37, 'Entrée sentier pieds nus'),
(9, 39, 'Une formule Américaine la pause'),
(10, 42, 'Un parfum'),
(11, 46, 'Un bon pour un bagel XL chez BagelStore'),
(12, 47, 'Entrées parcours dans les arbres'),
(13, 49, 'Un spaguetti :)'),
(14, 50, 'Une formule au Pitaya'),
(15, 51, 'Un bon pour 2 personnes pour une aprem Kayak'),
(16, 55, 'Une entrée pour ReboundWorld'),
(17, 60, 'Entrée activité de pleine nature'),
(18, 62, 'Deux boissons à la Trattoria'),
(19, 64, 'Un bon pour une glace chez Dino'),
(20, 69, 'Un menu pizza chez FortySixty'),
(21, 71, 'Entrées paintball, Archery, Laser'),
(22, 74, 'Un bon Häägen Dazs'),
(23, 77, 'Entrées parcours dans les arbres'),
(24, 80, 'Un bon pour une glace chez Dino'),
(25, 83, 'Un calin de Gaspart de Pizza'),
(26, 86, 'Sac à dos, règle, stylo, et carnet Acadomia'),
(27, 87, 'Une bouteille de vin au 5'),
(28, 90, 'Entrée activités de pleine nature'),
(29, 93, 'Une formule chez Pitaya'),
(30, 97, 'Entrée activités de pleine nature'),
(31, 99, 'Entrée sentier pieds nus'),
(32, 101, 'Un stylo et un pot à crayon Acadomia'),
(33, 104, 'Un bon pour un Bagel XL chez Bagel Store'),
(34, 110, 'Un bon pour une glace chez Dino'),
(35, 114, 'Bon pour une séance coaching minceur'),
(36, 119, 'Une entrée Rebound World'),
(37, 123, 'Sac à dos, règle, stylo et carnet Acadomia'),
(38, 126, 'Un bon Häägen Dazs'),
(39, 131, 'Deux boissons à la Trattoria'),
(40, 135, 'Un bon pour une glace chez Dino'),
(41, 138, 'Une bouteille de vin au restaurant le 5'),
(42, 143, 'Le carton de la dernière pizza mangée par Lucas Mas'),
(43, 146, 'Pour deux personnes aprem kayak'),
(44, 151, 'Deux réductions de trois euros à l\'aquarium'),
(45, 154, 'Entrées paintball, Archery, Laser'),
(46, 157, 'Une pizza au House Pizza'),
(47, 161, 'Entrée activités de pleine nature'),
(48, 165, 'Deux entrées à Altissimo Escalade'),
(49, 169, 'Entrée sentier pieds nus'),
(50, 174, 'Un bon pour une glace chez Dino'),
(51, 181, 'Bon pour une séance coaching minceur'),
(52, 186, 'Bon pour une Häägen Dazs'),
(53, 189, 'Une entrée ReboundWorld'),
(54, 193, 'Un bon pour deux personnes pour une aprèm kayak'),
(55, 196, 'Un bon pour une glace chez Dino'),
(56, 200, 'Un menu pizza chez FortySixty'),
(57, 205, 'Entrées paintball, Archéry, Laser'),
(58, 209, 'Une formule Pitaya'),
(59, 217, 'Deux réductions de trois euros à l\'aquarium'),
(60, 223, 'Sac à dos, règle, stylo et carnet Acadomia'),
(61, 228, 'Deux boissons à la Trattoria'),
(62, 231, 'Un bon pour un Bagel XL chez Bagel Store'),
(63, 237, 'Un bon pour une glace chez Dino'),
(64, 242, 'Une entrée ReboundWorld'),
(65, 245, 'Un bon Häägen Dazs'),
(66, 251, 'Entrée activité pleine nature'),
(67, 256, 'Une pizza au HousePizza'),
(68, 260, 'Un stylo et un pot à crayon Acadomia'),
(69, 267, 'Un bon pour un bagel XL chez Bagel Store'),
(70, 271, 'Entrées parcours dans les arbres'),
(71, 284, 'Un bon pour une glace chez Dino'),
(72, 292, 'Bon pour une séance coaching minceur'),
(73, 297, 'Une formule Américaine à la pause'),
(74, 306, 'Sac à dos, règle, stylo et carnet Acadomia'),
(75, 312, 'Un stylo et un pot à crayon Acadomia'),
(76, 321, 'Un bon pour un Bagel XL chez Bagel Store'),
(77, 328, 'Un stylo et un pot à crayon Acadomia'),
(78, 335, 'Carte 10% chez Sneacker\'s feel'),
(79, 342, 'Une entrée ReboundWorld'),
(80, 349, 'Un stylo et un pot à crayon Acadomia'),
(81, 361, 'Entree sentier pieds nus'),
(82, 374, 'Bon pour une séance coaching minceur'),
(83, 387, 'Entrées parcours dans les arbres'),
(84, 399, 'Sac à dos, règle, stylo et carnet Acadomia'),
(85, 421, 'Carte 10% chez sneacker\'s feel'),
(86, 448, 'Un bon pour une glace chez Dino'),
(87, 472, 'Un styloet un pot à crayon Acadomia');

-- --------------------------------------------------------

--
-- Structure de la table `secret`
--

CREATE TABLE `secret` (
  `idSecret` int(11) NOT NULL,
  `intitule` varchar(200) NOT NULL,
  `dateApparition` date NOT NULL,
  `idMembre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `secret`
--

INSERT INTO `secret` (`idSecret`, `intitule`, `dateApparition`, `idMembre`) VALUES
(1, 'J\'ai un petit grain de beauté sur ma lune', '2018-04-03', 23),
(2, 'J\'ai fait des doigts à la croix rouge étant en pls.', '2018-04-03', 43),
(3, 'C\'est la 3eme fois que je participe aux campagnes BDE de polytech Montpellier.', '2018-04-03', 24),
(4, 'Je suis Cumyxaphobe.', '2018-04-03', 39),
(6, 'Je n\'aime pas le nutella.', '2018-04-03', 26),
(7, 'J\'ai déjà vu un avion s\'écraser.', '2018-04-03', 6),
(9, 'J\'ai fait des auditions de The Voice mais je n\'ai pas réussi à passer à la télévision.', '2018-04-04', 45),
(10, 'Je suis sportif de haut niveau.', '2018-04-04', 46),
(11, 'J\'étais dans l\'armée pendant 3 ans.', '2018-04-04', 44),
(12, 'Je suis née un mois après noël.', '2018-04-04', 41),
(13, 'Mon père est né en Côte d\'Ivoire.', '2018-04-04', 42),
(14, 'J\'ai commencé à conduire à 14 ans.', '2018-04-04', 33),
(15, 'Je suis circoncis.', '2018-04-05', 31),
(16, 'J\'ai été élu miss camping.', '2018-04-05', 34),
(17, 'Je suis né le même jour que le président de la liste.', '2018-04-05', 29),
(18, 'Je me suis faite renversée par une voiture.', '2018-04-05', 25),
(19, 'Je sais jouer de la flûte.', '2018-04-05', 40),
(20, 'J\'ai fini au CHU lors de ma première soirée étudiante.', '2018-04-05', 38),
(21, 'Je suis le doyen de la liste.', '2018-04-06', 16),
(22, 'J\'ai été championne du Haut-Rhin de 400m haies.', '2018-04-06', 9),
(23, 'J\'ai baisé sur le toit du polygone.', '2018-04-06', 10),
(24, 'J\'ai eu un appareil dentaire pendant 6 ans.', '2018-04-06', 36),
(25, 'J\'ai été championne d\'Aquitaine de gymnastique artistique.', '2018-04-06', 8),
(26, 'J\'ai déjà vu mes parents faire l\'amour.', '2018-04-06', 17),
(27, 'J\'ai touché les couilles d\'Orelsan', '2018-04-07', 18),
(28, 'J\'ai sucé mon pousse pendant 13 ans.', '2018-04-07', 30),
(29, 'Mbappe est le cousin de mon cousin.', '2018-04-07', 1),
(30, 'J\'ai été vis champion de France de taekwendo.', '2018-04-07', 35),
(31, 'J\'ai plus de 200k abonné sur YouTube.', '2018-04-07', 2),
(32, 'J\'ai fait parti des 5 français sélectionnés pour un stage de baseball à Porto Rico en 2007.', '2018-04-07', 27),
(33, 'Je me suis brûlée la cuisse au 3ème degré mais je n\'ai pas de cicatrice.', '2018-04-08', 12),
(34, 'Je suis née en 2000.', '2018-04-08', 47),
(35, 'A 4 ans, je me suis cassé 2 fois les dents la même année sur un cheminée.', '2018-04-08', 11),
(36, 'En CE1 j\'é battue le recor de faute a une dicté (-42/20).', '2018-04-08', 21),
(37, 'J\'ai vomi dans la navette navigo au retour du heat.', '2018-04-08', 54),
(38, 'J\'ai le cou tordu à cause de mon frère.', '2018-04-08', 58),
(39, 'J\'ai 2 orteils collés.', '2018-04-09', 3),
(40, 'J\'ai sauté une classe et redoublé 2 classes.', '2018-04-09', 13),
(41, 'Je mange la raclette seulement avec de la crème fraîche.', '2018-04-09', 32),
(42, 'Je suis vice-champion de France 2010 de monocycle flat.', '2018-04-09', 20),
(43, 'Je n\'avais pas de dents en primaire.', '2018-04-09', 59),
(44, 'J\'ai embrassé 3 filles en même temps.', '2018-04-09', 50),
(45, 'J\'ai déjà mangé des guêpes.', '2018-04-10', 7),
(46, 'J\'ai eu ma mère 4 ans en tant que prof de maths.', '2018-04-10', 49),
(47, 'J\'ai baisé ma mono de colo.', '2018-04-10', 15),
(48, 'J\'ai rencontré un mec sur bazoocam.', '2018-04-10', 52),
(49, 'J\'ai dormi à l\'arrêt Louis Blanc.', '2018-04-10', 28),
(50, 'Je suis espagnol.', '2018-04-10', 56),
(51, 'Mon chien s\'appelle nuggets.', '2018-04-11', 57),
(52, 'J\'ai croisé ma belle mère en soirée.', '2018-04-11', 48),
(53, 'Je suis chef d\'entreprise.', '2018-04-11', 22);

-- --------------------------------------------------------

--
-- Structure de la table `TempJeu`
--

CREATE TABLE `TempJeu` (
  `idUser` int(11) NOT NULL,
  `debut` bigint(20) NOT NULL,
  `nomJeu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `TempJeu`
--

INSERT INTO `TempJeu` (`idUser`, `debut`, `nomJeu`) VALUES
(31, 1523205918560, 'Doodle');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `section` varchar(15) NOT NULL,
  `annee` int(11) NOT NULL,
  `password` varchar(200) NOT NULL,
  `pizzaCoin` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `verifier` int(11) NOT NULL,
  `estBanni` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `prenom`, `nom`, `section`, `annee`, `password`, `pizzaCoin`, `email`, `verifier`, `estBanni`) VALUES
(28, 'Theo', 'Ponthieu', 'MEA', 3, 's', 5, 'theo.ponthieu@etu.umontpellier.fr', 1, 0),
(29, 'Theo', 'Ponthieu', 'IG', 3, '$2a$08$FLgvH8ozW8gpd/fmCibxceaupYwukvDcPoatyojdKq/0nIexUQnWi', 25001, 'theo.ponthieu@etu.umontpellier.fr', 1, 0),
(30, 'Tony', 'Fernandes', 'MAT', 3, '$2a$08$9OJgBD5r2eS6PTYyf2XEueLbQTMA0yLyRUucr92CUkhnsnnjB60Se', 8720, 'tony.fernandes@etu.umontpellier.fr', 1, 0),
(31, 'nathan', 'traineau', 'IG', 3, '$2a$08$YF.oVluc.mqqXjlTYGwENeHAnxtn8ITauLUymIJ6lmyaIJEcBegEe', 25000, 'nathan.traineau@etu.umontpellier.fr', 1, 0),
(32, 'Bastien', 'Hilaire', 'MAT', 3, '$2a$08$UFAK12ZerMm4eD2pSFLx2uO4m/u4JmvGm8pQPEDPd7EuPIZJEbc0y', 5560, 'bastien.hilaire@etu.umontpellier.fr', 1, 0),
(33, 'Quentin', 'France', 'IG', 3, '$2a$08$XGBmxBjQRtQ6MNaDCrqx2.wtchIC8Ei5wAZ8QWpoUzgs/rw7tBW8C', 25000, 'quentin.france@etu.umontpellier.fr', 1, 0),
(34, 'Yvan', 'Pradier', 'MI', 3, '$2a$08$u8yifWGg7VZnSwjJovLyiuAD1I61QjxPSOpBPpECl92JBFwB/SLr2', 3880, 'yvan.pradier@etu.umontpellier.fr', 1, 0),
(35, 'Lea', 'Pennecot', 'PEIP', 1, '$2a$08$QjkgCdqsjVAkz1e3cwcGLu3Jps5KRTxccU4wDB9wboXGp/F85xD.O', 3720, 'lea.pennecot@etu.umontpellier.fr', 1, 0),
(36, 'Arthur', 'Miodowski', 'MAT', 3, '$2a$08$yT6qglKB1JhHId8VNwiIAuKqjjTdP.729fbE0I339/4Z55UyxLFxG', 25000, 'arthur.miodowski@etu.umontpellier.fr', 1, 0),
(37, 'Laure ', 'Teyssonnieres ', 'PEIP', 1, '$2a$08$qQp0DpyGr/.oyBHQyXg0sOeSKUnqHXFdX86fehViVbD5ZqXILUPsq', 12800, 'laure.teyssonnieres@etu.umontpellier.fr', 1, 0),
(38, 'Claire', 'Hubert', 'GBA', 3, '$2a$08$O8se..TTTndywbQ00q0a3O3e4eJp5Ehjc5DDMH.NHznDaBtIIEnBq', 19400, 'claire.hubert@etu.umontpellier.fr', 1, 0),
(39, 'Thomas', 'Saxod', 'MAT', 3, '$2a$08$O/6ni3uoJE1wyXrT/rZ7x.aN69VNTTWQ2RtmgMZ5uf4Ras1pqvHRK', 25000, 'thomas.saxod@etu.umontpellier.fr', 1, 0),
(40, 'Mehdi', 'Yansli', 'MAT', 3, '$2a$08$MfBOL1GRQXYmGhqRBXXgyeIoum0gr5X00SDd2Ebm.NkORh86x4zS.', 25000, 'mehdi.yansli@etu.umontpellier.fr', 1, 0),
(41, 'Solenn', 'Lopez', 'EGC', 3, '$2a$08$uXzj6yXt6BFARUqjLWV7Fepw1kX5CLcpZUW4OcVixrmfF12Bo23ia', 25000, 'solenn.lopez01@etu.umontpellier.fr', 1, 0),
(42, 'Antoine', 'Vivien', 'PEIP', 1, '$2a$08$L19hVQL1g1nEN4EqICFbAO9LTA/1j8lzLHyYRV.GUK9du3LzxWsvO', 25000, 'antoine.vivien@etu.umontpellier.fr', 1, 0),
(44, 'Loïc', 'Collinet', 'MI', 3, '$2a$08$E5Hqvbiotn31dUQlifqEV.1omFPxtqYjWrdyWJm9aucgX74.NSFLG', 25000, 'loic.collinet@etu.umontpellier.fr', 1, 0),
(45, 'Lysiane', 'GUILLOT', 'GBA', 3, '$2a$08$RNK6FySkH2C1vQ.9TqnBoeZbFCD.7u93yNIjz1DJjWFjFqlFU8XWS', 3520, 'lysiane.guillot@etu.umontpellier.fr', 1, 0),
(47, 'Nicolas', 'Guary', 'IG', 3, '$2a$08$4dMgcPHBF0t1T74FicZvHOoOGqLmHRWXGa53HooJR9LdO.jPoxs1y', 25000, 'nicolas.guary@etu.umontpellier.fr', 1, 0),
(49, 'Paul', 'DEMARS', 'MI', 3, '$2a$08$tIC4ZEBshixAZNwZzNVYGOw3p7ip7xUvzDsvYWD3.npRzVknRrVlW', 25000, 'paul.demars@etu.umontpellier.fr', 1, 0),
(50, 'Ilias', 'Mellah', 'IG', 3, '$2a$08$YRkHRZX3ZIPrXZ5OMcC3QOgkBXknxEUuI5YmkguRkkO3f1HQ6UuSm', 25000, 'ilias.mellah@etu.umontpellier.fr', 1, 0),
(51, 'Oriane', 'LAURENT', 'GBA', 3, '$2a$08$XNEUSHA/v4MSzOihvFRjfeDR5mbhFt8wOLaiLJh95cKV5PSosXAcO', 25000, 'oriane.laurent@etu.umontpellier.fr', 1, 0),
(52, 'Anaïs', 'Boucard', 'GBA', 3, '$2a$08$2j93XZFBx4B23TwFybivVuhUNTpdUnT6811t3BpZYyzECvS3bDlPq', 25000, 'anais.boucard@etu.umontpellier.fr', 1, 0),
(53, 'Marjorie ', 'Bouissière', 'MAT', 3, '$2a$08$yel0m4RUFinJnezuc2SjUuwTjrQC07jYRxsf2fooKDHuKxEtZ9EbW', 25000, 'marjorie.bouissiere@etu.umontpellier.fr', 1, 0),
(55, 'Laurent', 'Paire', 'EGC', 3, '$2a$08$TqGR8Mi0Ie2BJNlCsoyTi..B1Df/JiMUjsQExvSlbBez0pc0meIQe', 25000, 'laurent.paire@etu.umontpellier.fr', 1, 0),
(56, 'Benjamin', 'CHANU', 'MEA', 3, '$2a$08$SL5ypcYlS/5XffEfaWx0VeprRhdBum6Z0c6t9iBvDOeIpIG0KLn2y', 25000, 'benjamin.chanu@etu.umontpellier.fr', 1, 0),
(57, 'Camille', 'Loiseleux', 'GBA', 3, '$2a$08$2G13EW1cbFhemkHOVwsfyuTPWhBNShDGQNqe1uuQN2OUqVAVOIOV.', 25000, 'camille.loiseleux@etu.umontpellier.fr', 1, 0),
(58, 'Paul', 'Bantula', 'MAT', 3, '$2a$08$uFRFOCUnr2rBJp8NgenOwu7m8SznLU9jFQ6GXD2vHSkAx2PT4KWk2', 25000, 'paul.bantula@etu.umontpellier.fr', 1, 0),
(59, 'Nicolas', 'Gaillard', 'MAT', 3, '$2a$08$hbm47/MTsVB.quXoes5Gb.0Zi7riV9Lf6YpkX8qjaB5RXI2QjUntO', 25000, 'nicolas.gaillard01@etu.umontpellier.fr', 1, 0),
(61, 'Andrea', 'Prud’homme', 'MI', 3, '$2a$08$HuQM6LfdRUrvjes6WsGnr.kFm.k8y2jXmyi.WA8dem1rMeOTkgniK', 19401, 'andrea.prudhomme@etu.umontpellier.fr', 1, 0),
(62, 'Gaétan', 'Jung', 'PEIP', 2, '$2a$08$pG.yLo6nfE8ENVKj5aii1e4/d8sxu0hdp74hnGBt8SBegcHDpdEj6', 25000, 'gaetan.jung@etu.umontpellier.fr', 1, 0),
(63, 'Audrey', 'Bourelly', 'MAT', 3, '$2a$08$KljWEof6/0pgPZW4xlDXre7OoeOrdAhWlOkgFo70kWB9BXDdHetQy', 25000, 'audrey.bourelly@etu.umontpellier.fr', 1, 0),
(64, 'Luca', 'Due Birre', 'IG', 3, '$2a$08$PRayXSetn80EpA61rrhnheTqEsIxG8XdL1uB2mOGE.nRPbR1NJKp.', 25000, 'luca.debeir@etu.umontpellier.fr', 1, 0),
(65, 'Thomas', 'ROBERT ', 'MI', 3, '$2a$08$.JqSwSkB5hbFdJg5qnYqLu21jXsEESR1TLmDgaQ89Dhkpu5hYOhl2', 17720, 'thomas.robert04@etu.umontpellier.fr', 1, 0),
(66, 'Léa', 'Savouret', 'MI', 3, '$2a$08$iRR3Jek.YQkiasDB13ZZxunbx1UnwVJ3ScpU8OxV.M599g2rZd6qy', 25000, 'lea.savouret@etu.umontpellier.fr', 1, 0),
(67, 'Julien', 'Roumagnac', 'IG', 3, '$2a$08$wiAd9pxPrhgOL7Zol4ePA.AMuMF3bZywAhcWVxLDHiG6DRj/50lIi', 25000, 'julien.roumagnac@etu.umontpellier.fr', 1, 0),
(68, 'Mathilde', 'Conan', 'MAT', 3, '$2a$08$3VvzCRP4zvnh2Adm48kkIO9gT5jsEiPFQyVqlxsnv2NxCQ2CyAxma', 25000, 'mathilde.conan@etu.umontpellier.fr', 1, 0),
(69, 'Agathe', 'Bignon', 'MI', 3, '$2a$08$LS2Y3KoMBzSmZbsZLphmm.FFk0qul10yk45mpotot1KdatYkOkhQa', 25000, 'agathe.bignon@etu.umontpellier.fr', 1, 0),
(70, 'test', 'po', 'GBA', 4, '$2a$08$WmaLSHsmadKqNm8n8DUZzev2pcZAMsVSYqKeDI3CqmffrUuI/nzlW', 25000, 'theo-zef:jkjzbefqjhbz@etu.umontpellier.fr', 1, 0),
(71, 'Hugo', 'Signorino Gelo ', 'MAT', 3, '$2a$08$YfVFmv1iFQXR5x6I13A.m.Rqu..BdJ.nNPoSr62/FbuOv7QfBi8k2', 6520, 'hugo.signorino-gelo@etu.umontpellier.fr', 1, 0),
(72, 'Marc-Antoine', 'Danner', 'IG', 3, '$2a$08$52nFF/Cb9K348hmQ2wsCjudRsrjKU2EJTKaB3ebgh.9ATm5I1KT56', 25000, 'marc-antoine.danner@etu.umontpellier.fr', 1, 0),
(73, 'Andréa', 'Berassen', 'MAT', 3, '$2a$08$9vWzsC6pTjIwnwelehalP.6.yGcS.1Z91/kdO2KY/C33lQlMaBrlm', 25000, 'andrea.berassen@etu.umontpellier.fr', 1, 0),
(74, 'Louis', 'Schmitt', 'MAT', 3, '$2a$08$XbZ2DSbN0kHsclrzM52DUem7w7DUVN7oViUAhnar.BedM5BuJP2La', 25000, 'louis.schmitt@etu.umontpellier.fr', 1, 0),
(75, 'Victor', 'de Chavigny', 'MI', 3, '$2a$08$arqLcXqCh1YXoUY0FNlmX.Ra5SRGj432RpExJ2GfiW9T8aye.ohG2', 22766, 'victor.de-chavigny@etu.umontpellier.fr', 1, 0),
(76, 'Victor', 'Chavigny', 'PEIP', 4, '$2a$08$rFbN8DvpSu1jHdnOeuMguuCOCuxRVgLiVIKLUmSg/LKoGIPBupUgu', 25000, 'hdcsuzv-jsh.hsuvdh@etu.umontpellier.fr', 1, 0),
(77, 'Alessandra ', 'De Saint Leger ', 'GBA', 3, '$2a$08$TJ6idOmI3Rbj5emEqJFcU.ZXIT24n2Q0fWyXw7G5PitXfO/asRKum', 11840, 'alessandra.de-saint-leger@etu.umontpellier.fr', 1, 0),
(78, 'Sophie', 'Gadanho', 'MI', 3, '$2a$08$PelDKSqggu0PFzlAFMxZfegOTGMR4Al0jUXXk6a29oquIVno01qlW', 25000, 'sophie.gadanho@etu.umontpellier.fr', 1, 0),
(79, 'Emily', 'Perez-Bostedt', 'GBA', 3, '$2a$08$XkfP4VcB5mkSGhZHibakKeiomYQIKOcreOr5FBP0dDJiHtt2RJ9Gu', 25000, 'emily.perez-bostedt@etu.umontpellier.fr', 1, 0),
(80, 'Vincent', 'Vigne', 'PEIP', 1, '$2a$08$bU7qRo7P6Sxgky1qj1V.pOZZNN9s4wgBmpmjmIhcHY5R1N.nbdAOC', 25000, 'vincent.vigne@etu.umontpellier.fr', 1, 0),
(81, 'Claire', 'Ginestet', 'PEIP', 1, '$2a$08$AYSBJMD.KbKuRADpMnS5qe77tced503A.EMm67dTO2ZofKxTc5Fw.', 25000, 'claire.ginestet@etu.umontpellier.fr', 1, 0),
(82, 'Alixia', 'Filloux ', 'PEIP', 1, '$2a$08$nWESDIM11ed9bXvhLNrhBeN6freKdfobq5MOngnrLFbcdACgvDCJ.', 25000, 'alixia.filloux@etu.umontpellier.fr', 1, 0),
(83, 'Billy', 'Chaumès ', 'MEA', 3, '$2a$08$bl6yLYmOisW79Z4/dTFJxuTgtv.9r5FGwjsdd29mPpiNsv2AybGJu', 25000, 'billy.chaumes@etu.umontpellier.fr', 1, 0),
(84, 'Alexandre', 'Bottero', 'IG', 4, '$2a$08$TLA2JIRLgEwhmQNTWKIvMeko/nd7WMzHhgGfK9YtXJ1rV82gh/EIG', 25000, 'alexandre.bottero@etu.umontpellier.fr', 1, 1),
(85, 'Clémence', 'Poletti', 'MI', 3, '$2a$08$vAnUhOLFLlh//QNV506Z6OZrVJohUNyRXGvMwOxulE4fJOn1pNEuG', 25000, 'clemence.poletti@etu.umontpellier.fr', 1, 0),
(86, 'Marie', 'Giraud', 'EGC', 3, '$2a$08$wpjF5wkQZevqSGmQrMq9ce9pjfj.PyBZ98hwEf5LH7/F88gwRQmPu', 25000, 'marie.giraud@etu.umontpellier.fr', 1, 0),
(87, 'Camille', 'Hoareau', 'GBA', 3, '$2a$08$73RpTwVVIIdUCEzEEsDbXuz8xrMQ2mulk58M9r.EE694TKgv9kILC', 25000, 'camille.hoareau@etu.umontpellier.fr', 1, 0),
(88, 'Romane', 'Schnell ', 'MI', 4, '$2a$08$foyLRuT2mj/D9VTRIiT2ie8sFoTSwuJ7EN97E2LP/4Ulbz8AnKUBW', 25000, 'romane.schnell@etu.umontpellier.fr', 1, 1),
(89, 'Alicia', 'D’Orazio', 'MI', 3, '$2a$08$QySbVIwuHyN1ddZfJI31R.z/x90gAhrFTmlU9BagL3o0QWDNnrQp6', 25000, 'alicia.dorazio@etu.umontpellier.fr', 1, 1),
(90, 'Audrey', 'Samson', 'IG', 3, '$2a$08$UekO7K9sowS/JJoDHeOHMu1gbhvSVxOODGdp2adkVk1d0AfYODH9K', 25000, 'audrey.samson@etu.umontpellier.fr', 1, 0),
(91, 'Thomas', 'Remy', 'IG', 5, '$2a$08$oIeDKakn3eMI9sUXHST14uPmH2V9p7UJNG.TQQ2CNSP4NE5YGCUCi', 25000, 'thomas.remy@etu.umontpellier.fr', 1, 0),
(92, 'James', 'TERRIEN', 'IG', 4, '$2a$08$McRsCxI7ntsBpATkggP1iuEl.UZMCfjXSL0DIqxsnudINJd8eTwV.', 25000, 'james.terrien@etu.umontpellier.fr', 1, 0),
(93, 'Elodie', 'Chalons', 'MI', 3, '$2a$08$SGz/SXzJhbRzQM4UmAVC7.JivKWIIGxBwEhUsAKPrfXFb/zyoO3Ce', 25000, 'elodie.chalons@etu.umontpellier.fr', 1, 0),
(94, 'Quentin', 'Lehérissé', 'MEA', 3, '$2a$08$komJE.LJgcvoQX.TbKHVcObgMjjGqDpy5t9Jf1kCWXelhrR/hCuDq', 25000, 'quentin.leherisse@etu.umontpellier.fr', 1, 0),
(95, 'Mathieu', 'Gauer', 'EGC', 3, '$2a$08$yMG9iaiFJqHTZ6Ub6Fh2yuDI63Kiix78J.9NiEFarWPiAlvAusVtu', 25000, 'mathieu.gauer@etu.umontpellier.fr', 1, 0),
(96, 'Clémence', 'Fontaine', 'IG', 3, '$2a$08$GsLAQhfZh51wQ2X9HuI7BOpzEYJP/qCv/UHqZtYG7aOeB0ypjtAHO', 25000, 'clemence.fontaine@etu.umontpellier.fr', 1, 0),
(97, 'Pablo', 'Portier', 'MAT', 4, '$2a$08$dON/.FDZBY6mNwD6wQTeuO5mfOHXoKFy/wyxQODQajLPc8vEhDXs.', 25000, 'pablo.portier-recio@etu.umontpellier.fr', 1, 0),
(98, 'Martin', 'Cayuelas', 'IG', 3, '$2a$08$gO4PfQJJD39QrnG28ei4pu4URUA3Xg.PseSWSW6twGic9xzacMTMy', 25000, 'martin.cayuelas@etu.umontpellier.fr', 1, 1),
(99, 'Yohanna', 'Michau', 'STE', 3, '$2a$08$Ivws6.biKJRJ7QuugKe5k.S/qNsYayVNOOAJcP/U3LvybdQ1QVqGe', 25000, 'yohanna.michau@etu.umontpellier.fr', 1, 0),
(100, 'Augustine', 'Hallier', 'GBA', 1, '$2a$08$HeO1vvwPeo/fSNsuqMFLKuK4kY.1Jp4GrZYCHyoShNgrNw37Fj00q', 25000, 'augustine.hallier@etu.umontpellier.fr', 1, 0),
(101, 'Maxime', 'Carin', 'IG', 3, '$2a$08$WDkKaWhzC6H1BrbimU5Jmu3kta9q4LysgoiWYljmImuRkYLY4LTPK', 25000, 'maxime.carin@etu.umontpellier.fr', 1, 0),
(102, 'Adam', 'Megherat', 'IG', 3, '$2a$08$9GVzw7gNZ5yXQQYYirgFp.eAh0dxBxVxB5oZXnFtZP58WPpAycNM6', 25000, 'adam.megherat@etu.umontpellier.fr', 1, 0),
(103, 'Manon', 'Palminteri', 'MAT', 4, '$2a$08$iZr6YKWaP6vVh0rDgv3LxOH606J.rX72Kw5um/4XNvxwZXooW4zDW', 25000, 'manon.palminteri@etu.umontpellier.fr', 1, 0),
(104, 'Matthieu', 'Bouree', 'MEA', 3, '$2a$08$Y6lxAk8vdr.3xgvcct9ZQO3whLuYID0b/f2ykMSNdcW2weJAWROFi', 25000, 'matthieu.bouree@etu.umontpellier.fr', 1, 0),
(105, 'Antoine', 'Suty', 'MAT', 4, '$2a$08$HjgMgFw1AOY2XvLV.vBw/.PgFu5liTkMryOfdUSkwUwuBW7VzZqGa', 25000, 'antoine.suty@etu.umontpellier.fr', 1, 0),
(106, 'Fahd', 'Lisser', 'MAT', 4, '$2a$08$prIQm8kQLycohQfO/eQXEe2tkprhUVUd.I/lphwmD1zIVfoA79Pzq', 25000, 'fahd.lisser@etu.umontpellier.fr', 1, 1),
(107, 'Rémi', 'Gestin', 'IG', 3, '$2a$08$QRZ8UMh5AlhYNcW9pQU.suM3U5s2ezS2BfNhwMcWcIIzkh3dmtNn2', 25000, 'remi.gestin@etu.umontpellier.fr', 1, 0),
(108, 'Emma', 'Rieu', 'MAT', 4, '$2a$08$xBs2/CEZ6gDxSnaJlgJckuKZI99C9mPCSPYIHmucgX.S6bihOdTru', 25000, 'emma.rieu@etu.umontpellier.fr', 1, 0),
(109, 'Zoe', 'Reynes', 'GBA', 3, '$2a$08$y2MBDPt.iOeU0x1v9ShI8eDfciVByBfdmMejG5NdBWT4kq6ettcMi', 25000, 'zoe.reynes@etu.umontpellier.fr', 1, 0),
(110, 'Damien', 'Lecha', 'IG', 3, '$2a$08$cuG4nmbUwFRIPw5BmUlzt.wcBlA1gqSgwjvLQZZYy6pqZ6vpOmCke', 25000, 'damien.lecha@etu.umontpellier.fr', 1, 0),
(111, 'Marine', 'Colon', 'GBA', 3, '$2a$08$KkMZ74pGRMvGwIsBLjH29uqckzId4hfvg8gPViyDkohk8v/c8it/K', 25000, 'marine.colon@etu.umontpellier.fr', 1, 0),
(112, 'Nathan', 'Guillaud', 'IG', 3, '$2a$08$p.6YoF.X/Wd3.e82p8RvpO.BtBriRCTs9JTO7P/floyyOh1TvcMKq', 25000, 'nathan.guillaud@etu.umontpellier.fr', 1, 0),
(113, 'Mathilde', 'Merlin', 'STE', 4, '$2a$08$IgEAQeZKCTgt4A2daBZajuX.jotFg.iyBSgjQ1Tb/E4IWuyipIaDC', 25000, 'mathilde.merlin@etu.umontpellier.fr', 1, 0),
(114, 'Corentin', 'Molette', 'MI', 4, '$2a$08$Mfz5cpw7H7mC55nuwPiMIO55tM8AtVOjyPvhtuF/A5S6fkC1nW2Hq', 25000, 'corentin.molette@etu.umontpellier.fr', 1, 0),
(115, 'Hugo', 'PICARD', 'MI', 4, '$2a$08$59ts8anCDXMsBBw3xPpkhe2Z5OGE0ismboYU4gUiqwxR9rXHWvWwe', 25000, 'hugo.picard@etu.umontpellier.fr', 1, 0),
(116, 'Olivia', 'Belorgeot', 'MAT', 4, '$2a$08$/.d5tM5bRCDM4U9IFrp5MuGT09NRTBYpL6TSxWs1y3f9Flc9KPKzi', 25000, 'olivia.belorgeot@etu.umontpellier.fr', 1, 1),
(117, 'Clément', 'Laborde', 'MI', 4, '$2a$08$sxsKUPCWaWEFSUn8tbQWPuPcLabsCebNQ..znUiJY6LHa9DRLq20y', 25000, 'clement.laborde@etu.umontpellier.fr', 1, 0),
(118, 'Cyril', 'Pluche', 'IG', 4, '$2a$08$JeK1ZkYqsbwRUWj/7W7/A.Ep4anEJC5ikJMJG3oKiXbF1aY9.JflK', 25000, 'cyril.pluche@etu.umontpellier.fr', 1, 0),
(119, 'Benjamin ', 'LEJEUNE ', 'MI', 3, '$2a$08$V0Xodnhz5rrrQVpHfMSiAua8aM1viZ4miROdeUyzE68I33tQ1ybrW', 25000, 'benjamin.lejeune@etu.umontpellier.fr', 1, 0),
(120, 'Aubin', 'Faugerolle', 'STE', 3, '$2a$08$CJZ8AB/i3KFCEFJuLNlP6.RqBC4DEjPJrh00coTQyM9pjp8cP0X9W', 25000, 'aubin.faugerolle@etu.umontpellier.fr', 1, 1),
(121, 'Pierre', 'Segonds', 'GBA', 3, '$2a$08$AT4I4JK3Gt9f33XP6eq/d.EHy5T7URWtpw88EtYwX8TDQmyRgbjWC', 25000, 'pierre.segonds@etu.umontpellier.fr', 1, 0),
(122, 'Paul', 'Arnaud', 'IG', 3, '$2a$08$0/tQ8oVBZFNkH5mv2HxXIel1yF2XFtA3fDRkJwAyNw8LG8o46eoCW', 25000, 'paul.arnaud@etu.umontpellier.fr', 1, 0),
(123, 'Alexandre', 'Mari-olive', 'MI', 3, '$2a$08$.BfHCQo0A.c.AqliQEGpPO5L/GAHRnWwn/sfkjAn35euxJ9efVjSu', 25000, 'alexandre.mari-olive@etu.umontpellier.fr', 1, 0),
(124, 'Guillaume', 'Grandmougin', 'MI', 3, '$2a$08$6sMLXV41MARGx6yzzN1nK.2xqdpUZ1ykMX6IVS7UwWSJJCipzdw/S', 25000, 'guillaume.grandmougin@etu.umontpellier.fr', 1, 0),
(125, 'Marouane', 'El Madani', 'IG', 3, '$2a$08$N9EX/vIH8q/qnLzxSmzHEOgw79MGVQ6kE9zolEhBmOXGm7Mlm6uaK', 25000, 'marouane.el-madani@etu.umontpellier.fr', 1, 0),
(126, 'Alexis', 'Luangpraseuth', 'IG', 3, '$2a$08$SoBYe.S5n7X4tH5zwdpsKOz8u4cOppOxV/V2ggSwCU6ij9Q7XuUEi', 25000, 'alexis.luangpraseuth@etu.umontpellier.fr', 1, 0),
(127, 'marion', 'rul', 'IG', 4, '$2a$08$MX9lW228alRWj9qGZQJt6edctZUcygbr2ENhek1QBK8WHZgG6w2iS', 25000, 'marion.rul@etu.umontpellier.fr', 1, 0),
(128, 'Eva ', 'Carême ', 'GBA', 3, '$2a$08$LOCfCb7kSNPtaCo6.gust.v0tIMGx05tmTs95BL3NsKR.WHbEcvLi', 25000, 'eva.careme@etu.umontpellier.fr', 1, 1),
(129, 'Salomé', 'Gardeux', 'MAT', 3, '$2a$08$2AWYPIBSNaU8Wf7mdKlGLOdUvZ1Wg1iYxmoFXkBwNRHsKkhlXxMAC', 3840, 'salome.gardeux@etu.umontpellier.fr', 1, 0),
(130, 'Marina', 'Gonzalez', 'MAT', 3, '$2a$08$rrAii0jmPCUGhOvClu.kW.VLf6HBzAKGCZV7EXeF0apvQs.l5ODda', 25000, 'marina.gonzalez@etu.umontpellier.fr', 1, 0),
(131, 'Sandrine', 'Laveau', 'GBA', 3, '$2a$08$RoGVnNmXn3HpZhoVGD9AGe5MithQU3kQG3C8Ki8p/OSN7/6pXaoCe', 25000, 'sandrine.laveau@etu.umontpellier.fr', 1, 0),
(132, 'David', 'Bastin', 'MEA', 3, '$2a$08$f1JEElTTQsBvF3oSy9mAmeiktGaHYuElNC9g/ufaMBon1lhkM653O', 25000, 'david.bastin@etu.umontpellier.fr', 1, 0),
(133, 'maéva ', 'balon', 'GBA', 4, '$2a$08$u/8/tJsbSbaCmgc.jgDe7e7acofZay2gHSMsQ54AyopdqH0YefyoW', 25000, 'maeva.balon@etu.umontpellier.fr', 1, 0),
(134, 'Thibault', 'Batifol', 'MI', 4, '$2a$08$7Y8Q/MIu9LF6LpC3rzDZvOWFVmomnNZySs.XXSdCjm5DCzBWAK8DW', 25000, 'thibault.batifol@etu.umontpellier.fr', 1, 0),
(135, 'Claire', 'Achard', 'GBA', 3, '$2a$08$Iw91Elix2sqjF50Y0Wgko.uqQe5H9I/l5yQ55yncR60kODnS1KHUy', 25000, 'claire.achard@etu.umontpellier.fr', 1, 1),
(136, 'Dorian', 'BOTELLA ', 'MI', 5, '$2a$08$Oc5NK5QoH95/yy84er9dUOEFm3U1T5rQ4xiHu5y0qNmbB.SkS3xlm', 25000, 'dorian.botella-barillot@etu.umontpellier.fr', 1, 0),
(137, 'Solène', 'SERAFIN', 'IG', 3, '$2a$08$O/8tnFe3teAMVLtNpx5pnOF2IxNhmW8ooM8vPVEfJCo//LiUEupQm', 25000, 'solene.serafin@etu.umontpellier.fr', 1, 1),
(138, 'Mathieu', 'Vangrevelynghe', 'MAT', 5, '$2a$08$jeSAEO3e3cDnXNaiXAocouXzdP2QmwqvpwVu0WkuThSjYMZDOeZSq', 25000, 'mathieu.vangrevelynghe@etu.umontpellier.fr', 1, 0),
(140, 'Eugénie ', 'PICOT', 'GBA', 5, '$2a$08$zL/oZMF32EmnmtVcTrBqq.m8eIQXqq94n/nVpDG0QZibexJBloAJi', 25000, 'eugenie.picot@etu.umontpellier.fr', 1, 0),
(141, 'Aubin', 'ABADIE', 'IG', 3, '$2a$08$0Y5C2.J9HnLZbzZAJ4THy.og6nRCcQ8NtQxP.svIFTWhVYkvlssIu', 25000, 'aubin.abadie@etu.umontpellier.fr', 1, 0),
(142, 'Vincent', 'Herreros', 'IG', 4, '$2a$08$xhHxo.4rDx5PrqrkCAgVhOCC9FWedbFNP0/e47nOR78TY4/N4Oakq', 25000, 'vincent.herreros@etu.umontpellier.fr', 1, 0),
(143, 'Ezéchiel', 'PINEDE', 'PEIP', 1, '$2a$08$kwXJpSl0akWMMJjhzJZQjuDWyrTJycFdEkht9UlAmRmqSieJT5Lzq', 25000, 'ezechiel.pinede@etu.umontpellier.fr', 1, 0),
(144, 'Gaëtan', 'Allano', 'MEA', 5, '$2a$08$pHMdqc5.NL19bIKegkDtUOKmokNQ3UXAi5Sifje5EVPX62KTSwvlq', 25000, 'gaetan.allano@etu.umontpellier.fr', 1, 0),
(145, 'Yannick', 'Mayeur', 'IG', 3, '$2a$08$1YeVsnwlK8qyxjb/NTiPPuFqZnBreBZPT2XEflu6B8Z5C/5iFd6Ea', 25000, 'yannick.mayeur@etu.umontpellier.fr', 1, 0),
(146, 'Antoine ', 'Mallet ', 'PEIP', 3, '$2a$08$7bBrV.9yhyFLmnSXG.V8sujd7sNgwmAObhPqsRJ0IHEllPhSO8F32', 25000, 'antoine.mallet@etu.umontpellier.fr', 0, 0),
(147, 'Lucas', 'Gonçalves', 'IG', 3, '$2a$08$y.AjffaZLWBig.m6vBHnPedRiF0NATkUk6Ow7MTlVfbgZQDgSJzVi', 25000, 'lucas.goncalves@etu.umontpellier.fr', 1, 0),
(148, 'Tristan', 'Aznavourian', 'GBA', 4, '$2a$08$NyKMSFzn3T9k8Df3boeP2eyyO075Rk3XQoI3PQu4FGZTrtA0qJktG', 25000, 'tristan.aznavourian@etu.umontpellier.fr', 1, 0),
(149, 'Thomas', 'Falcone', 'IG', 3, '$2a$08$PdCEmXn69wu1isQD91CvJuHE9eMsrHhEyOKrNqixTpLDQDVmbtMaO', 25000, 'thomas.falcone@etu.umontpellier.fr', 1, 0),
(150, 'Valérie', 'Klein', 'GBA', 4, '$2a$08$6KurLvVKiwrxJA8t8Vvr/.Bd2xlSkHey5cSgDl8oWwLyy1TVeIh2e', 25000, 'valerie.klein@etu.umontpellier.fr', 1, 0),
(151, 'Quentin', 'MERCIER', 'STE', 5, '$2a$08$Hw98Z6PPcao0UI63VkgvLueVL.PXlWaXEsjPI2hcYEpyKvrulhfo2', 25000, 'quentin.mercier@etu.umontpellier.fr', 1, 0),
(152, 'Cyprien', 'Legrand', 'IG', 4, '$2a$08$L0mJPHgyalUMOZJZrKPLROp8scl9EHiiC1HeHbC36Amv6R9q4/HKK', 25000, 'cyprien.legrand@etu.umontpellier.fr', 1, 1),
(153, 'walid', 'chaib', 'IG', 3, '$2a$08$a.DKhmsxzDfQCeSWb.R4q.iV7zIzK8DzbsfiDLUfsMzRlS9o4C.Fi', 25000, 'walid.chaib@etu.umontpellier.fr', 1, 0),
(154, 'romain', 'thevenon', 'IG', 4, '$2a$08$oLCpPyPEcCLhw/wKSBHhyeagDGixSWj62tVlkT3DG0.Veg60Jen.S', 25000, 'romain.thevenon@etu.umontpellier.fr', 1, 1),
(155, 'Andrei-Cristi', 'Stuparu', 'IG', 3, '$2a$08$igVgI6mLXmcDoMtygSDDkufMk9bkc4FMuQP6nLLYGKZf3kqBBRZ7K', 25000, 'andrei-cristi.stuparu@etu.umontpellier.fr', 1, 0),
(156, 'partenaire', 'partenaire', 'part', 3, '$2a$08$sByNEW/0YiRmVQYVhXGMT.y9IqlwLa4IWwIsygp4BJrF4tBNcVJqK', 25000, 'partenaire', 1, 0),
(157, 'Kevin', 'Giordani', 'IG', 4, '$2a$08$vzhE/v3Dh79wGeq7FLVtgOIRYEzVP2Ql10KMKDBupRqKPvVIZjL06', 25000, 'kevin.giordani@etu.umontpellier.fr', 1, 0),
(158, 'Adrien', 'Auriol', 'MI', 4, '$2a$08$EPHZqpjlg/mE5F4IwpWFDubqU54i.HnhRbceFSpsQm8zYLPfeWToe', 25000, 'adrien.auriol@etu.umontpellier.fr', 1, 0),
(159, 'Tanguy', 'Molinier ', 'MI', 3, '$2a$08$H3kusc8ZfLCXua2p7SBy5O7s5hdx65i97bR1oliV5rVgTTua56/8G', 25000, 'tanguy.molinier@etu.umontpellier.fr', 1, 0),
(160, 'Chloé', 'Dalger', 'IG', 4, '$2a$08$sQ.5qprvbpKWjfPr7JpyjOepsPo04HWuM6SgO/WC2iDfBZzaahUQC', 25000, 'chloe.dalger@etu.umontpellier.fr', 1, 0),
(161, 'Vincent', 'Roussel', 'MI', 3, '$2a$08$AoPei/KDlAhqn1rvrboOBOssc1uYWBFm/afKux3OGUKN0lzcbFYES', 25000, 'vincent.roussel01@etu.umontpellier.fr', 1, 0),
(162, 'Lucille', 'Gey', 'GBA', 5, '$2a$08$d5Tzk2K5xpCGMG/lbp5FtuJmnSDTWNu8B8axMX7IUYWuGdYl2grE2', 25000, 'lucille.gey@etu.umontpellier.fr', 1, 0),
(163, 'Thomas', 'BOYER', 'MEA', 3, '$2a$08$37nabN72cJ1ty72UKcrNjOchA6KgWw6sDoQv5Iq2R.g9xK6ecUzGi', 25000, 'thomas.boyer@etu.umontpellier.fr', 1, 0),
(164, 'Gael', 'Rocci', 'MEA', 4, '$2a$08$h64bYa5mEhdITe6cvohSbOKR.OfZMUnYcif4duBUVV6uVFeYLGDr.', 25000, 'gael.rocci@etu.umontpellier.fr', 1, 0),
(165, 'Bastien', 'Souf', 'PEIP', 2, '$2a$08$mFK.ZHTwTzcegpbkzvJaW.sBkotYahngakrFenIeBHlGllZw9JMrW', 25000, 'bastien.souf@etu.umontpellier.fr', 1, 0),
(166, 'Salomé', 'Bossard', 'GBA', 5, '$2a$08$BFp9qWA6Wd0vidIQiYbRj.hEdoEEIeajKgJM3kEE.6XMPj4SiU0U.', 25000, 'salome.bossard@etu.umontpellier.fr', 0, 0),
(167, 'Jean', 'Miquel', 'IG', 5, '$2a$08$EZOApiENj/Z4DO36OUrpM.PbxgrjRLkpTVjE2R8FPtc75MtkxDBU6', 25000, 'jean.miquel@etu.umontpellier.fr', 1, 0),
(168, 'Loriane  ', 'Poirot', 'PEIP', 2, '$2a$08$phVn8wZQgRc4JULjRkqtm.BM8GBPnFcd.fKFpPq/vZw7VgzjV4Q3y', 25000, 'loriane.poirot@etu.umontpellier.fr', 1, 0),
(169, 'Guillaume', 'Boota', 'MI', 5, '$2a$08$K3Bmu5qnIVSezflj2VB33ub07T2jyqGb4cWkeTd6flABYDLUzzPDG', 25000, 'guillaume.bosio@etu.umontpellier.fr', 1, 0),
(170, 'Alice', 'GUERIN', 'EGC', 4, '$2a$08$xIjQmRTue0iV7DVi45jj2OOp3g2Xm3/t2RcLgUqNKuHT4IW2ZaEC6', 25000, 'alice.guerin@etu.umontpellier.fr', 1, 0),
(171, 'Fantine', 'Guiton', 'GBA', 3, '$2a$08$AROJ3GqoRHOW0B3qCA5.yOoq4rsZFYwQK8FP226p/C.KA6wxhLGoi', 25000, 'fantine.guiton@etu.umontpellier.fr', 1, 0),
(172, 'Coralie', 'Bianco', 'PEIP', 2, '$2a$08$W4CxZxTuoP6bvVNsVibZM.W5xPLDaVKNMk8RxYZelV4qCahVHDoUK', 7600, 'coralie.bianco@etu.umontpellier.fr', 1, 0),
(173, 'Clément', 'Bosone', 'MI', 5, '$2a$08$xH59iYVfqBEFP.E.Dd6lXuEmEj4mPFcikuqSiBUukxQXKiJZaHFV.', 25000, 'clement.bosone@etu.umontpellier.fr', 1, 0),
(174, 'Caroline', 'Apprioual', 'PEIP', 2, '$2a$08$TDV3J0A7s63Vsho.K3soKuKefTMS6tW9XwUTdf3X7pR2QyoOvuND.', 25000, 'caroline.apprioual@etu.umontpellier.fr', 1, 0),
(175, 'Clémentine', 'Casarrubios ', 'MEA', 4, '$2a$08$piUmb6P0wL0nfjXFtSEKneCNyQtJzRmmaY8l6zEBeLmJSMWn81uAS', 25000, 'clementine.casarrubios@etu.umontpellier.fr', 1, 0),
(176, 'Sheena', 'Maucuer', 'IG', 4, '$2a$08$mZGcMPXSPINJHPyApBYFv.cxHLbiUNHsCpwogtdCSaU0Bbl70lv7m', 25000, 'sheena@etu.umontpellier.fr', 1, 0),
(177, 'Merzougui', 'Ines', 'PEIP', 2, '$2a$08$F4EjqI6aJ4AmcUzWus/wc.cbSg4dLYrBtKYwKOTckZfpPhpipOjfq', 25000, 'ines.merzougui@etu.umontpellier.fr', 1, 0),
(178, 'Manon', 'Cordeau', 'GBA', 3, '$2a$08$PmFxTLwXvXKCBGkhsJY/Se6JVhxCNvwq88i6olu7PrAJWeUi16.e2', 25000, 'manon.cordeau@etu.umontpellier.fr', 1, 0),
(179, 'Léna ', 'Duris ', 'GBA', 4, '$2a$08$TdO4TB1crs0lKP5fp4qrTO1aEAqoXvhzQjojsCXdr.mdPDqqDgWOS', 25000, 'lena.duris@etu.umontpellier.fr', 1, 0),
(180, 'Meilin', 'Carle', 'STE', 4, '$2a$08$Lf1VK7mF3yf2NAZp4bPf1OWnfMrIUV9EJtdDeg540378Se.wTcJs6', 25000, 'meilin.carle@etu.umontpellier.fr', 1, 0),
(181, 'Michaël ', 'Van schelstraete', 'MI', 3, '$2a$08$OJWR4cjK6k/eTf.vK5HMLOUpHKl/8FgNhFsYQ4Og6mA9T/n5q6Haa', 25000, 'michael.van-schelstraete@etu.umontpellier.fr', 1, 0),
(182, 'Sylvain', 'BARANTHOL', 'SE', 4, '$2a$08$lwOq.KSpqrX6aKLeWYNZxevGlvcIPtZRiWA0rz5UlIQQ6HNHGpsIq', 25000, 'sylvain.baranthol@etu.umontpellier.fr', 1, 0),
(183, 'Valentin', 'LUCIANAZ', 'SE', 4, '$2a$08$lXGd3YrKCu7oK3Fcm5QU/eYQlTkHf7y38huDTFcL.QdVfr1krHEpa', 25000, 'valentin.lucianaz@etu.umontpellier.fr', 1, 0),
(184, 'Benjamin', 'Nock', 'MEA', 4, '$2a$08$2jydszgV5xy3FurI9YIrs.X/xlkx8HKU5tuQdYrR1hFafJd/xSm1.', 25000, 'benjamin.nock@etu.umontpellier.fr', 1, 0),
(185, 'Célia', 'GRAZIANI', 'STE', 4, '$2a$08$Q/x5llc5AhqkL0raM0yhuuxF2fQgdqpq/d4bJNHn.ajandDOjYzoy', 25000, 'celia.graziani@etu.umontpellier.fr', 1, 0),
(186, 'Camille', 'Thiebaut', 'PEIP', 1, '$2a$08$wa0qTrYdh.eFrw89rIOuVuCVgfvReZfMNl84Orc2GadgTwIMCtXIS', 25000, 'camille.thiebaut@etu.umontpellier.fr', 1, 0),
(187, 'Matthieu', 'DYE', 'IG', 4, '$2a$08$HTLUaj4r1ZZUy7OHJbud6.viQEIy7P4s5KTBO0nTxdwg7q.KVsyie', 25000, 'matthieu.dye@etu.umontpellier.fr', 1, 0),
(188, 'Florian', 'Reinders', 'GBA', 4, '$2a$08$pMxMMdqgdtMjWtTaPT7uLegmy.NYHcuEtQMn9xhJFvZZRv01DNkL2', 25000, 'florian.reinders@etu.umontpellier.fr', 0, 0),
(189, 'Nicolas', 'Caseau', 'PEIP', 2, '$2a$08$gkJ8KPlZvIUVg.uM0jjzbOK.7TCPk42fJPMdgYjzFc8OtXwePZ9s6', 25000, 'nicolas.caseau@etu.umontpellier.fr', 1, 0),
(190, 'Yves', 'Boinette', 'MAT', 3, '$2a$08$gly/dGIQ7052EGBS8sG0D.eAwu8yyXc9oP/PspmQtQJPtL5zsUGcO', 25000, 'yves.boinette@etu.umontpellier.fr', 1, 0),
(191, 'Tsilefy ', 'RAMASOMANANA ', 'MEA', 5, '$2a$08$7/zRCpfLQCVg1XfKe7f/6uf2LDicNJEqbWRi5T152wP.CmMr5QbBy', 25000, 'tsilefy.ramasomanana@etu.umontpellier.fr', 1, 0),
(192, 'Raphael', 'Bordoux', 'PEIP', 2, '$2a$08$BAr.iGi0s9qi.qqlwYovDeROmQwvfOvxBx9GCz4uuHNJLAByLaCbi', 25000, 'raphael.bordoux@etu.umontpellier.fr', 1, 0),
(193, 'Lukas', 'Vernay', 'EGC', 3, '$2a$08$hRO8nSnTMXBkDd8Yn8zkEez20ji/TH1uARzaWZ3MUKo4Kdb9JwKd6', 25000, 'lukas.vernay@etu.umontpellier.fr', 1, 0),
(194, 'Auriane', 'Feroussier', 'GBA', 4, '$2a$08$kYhNUkLA1Eq6JjtK6o.eWO..AwbriIEAfIJv9zsr6SoxgBERB6dLK', 25000, 'auriane.feroussier@etu.umontpellier.fr', 1, 0),
(195, 'Mathias', 'Legris', 'GBA', 3, '$2a$08$8Odw5F7ilwDeGm5qEQAwj.Vux2SVXNs.tOLZjgNoDpV0sXVl/rxIq', 25000, 'mathias.legris@etu.umontpellier.fr', 1, 0),
(196, 'Simon ', 'Mayen', 'PEIP', 1, '$2a$08$U4utBBJO0e1Hv0p2KBlCauxJ.lGRZsrT7s8t5FGfYG1WHeMzX5Xs6', 25000, 'simon.mayen-preel@etu.umontpellier.fr', 1, 0),
(197, 'Théo ', 'Di Vuolo', 'PEIP', 1, '$2a$08$rF2z8aQz8bdMFS4g8MkJruDBwO8KVXhTksOxGsWpDCuIUBAI/5kU.', 25000, 'theo.di-vuolo@etu.umontpellier.fr', 1, 0),
(198, 'Lise', 'Gransagne', 'GBA', 4, '$2a$08$8q8xi4gu57ImJO8NhuuX9OA/PHGe1mTLS6xqCzxSpiwWHFmyrYB7C', 25000, 'lise.gransagne@etu.umontpellier.fr', 1, 0),
(199, 'Melanie', 'Sacco', 'GBA', 4, '$2a$08$FlwoYYlY2udfTcSpk99LJeCtcLs84I/pBGy8CYsxNRIPuNsdSOVNm', 25000, 'melanie.sacco@etu.umontpellier.fr', 1, 0),
(200, 'Stefan', 'Copetchi', 'IG', 3, '$2a$08$pAeBeiwvfP1S2UECltOU/eYEMc2oVXWnVctAA6pdFPzxiDNGH.bsC', 25000, 'stefan-dragos.copetchi@etu.umontpellier.fr', 1, 0),
(201, 'Chloe', 'Alessi', 'GBA', 4, '$2a$08$9WoNEs3e35RLj26D27O4wOd2QIL9korih6wrBDSaIhqBb4jTYFKxK', 25000, 'chloe.alessi@etu.umontpellier.fr', 1, 0),
(202, 'Camille', 'Dumas', 'GBA', 4, '$2a$08$Pv1XJbnAkOsjJVVJWvm93.1cDdc1q2I.JtuK4Y73BOQ04ijVOEAF2', 25000, 'camille.dumas@etu.umontpellier.fr', 1, 0),
(203, 'Chloé', 'Bois', 'GBA', 4, '$2a$08$5goXyo87Cm893P9pl3G9T.NUYRseHfZpinfyQ4V94hQYs7rVvUhtK', 25000, 'chloe.bois@etu.umontpellier.fr', 1, 0),
(204, 'Caroline', 'Bejar', 'GBA', 4, '$2a$08$TpMoH8ueuwi/gZj.iRh0Le/3mJ4Il3rFLhLA6WieL32fYzRDe0G26', 25000, 'caroline.bejar@etu.umontpellier.fr', 1, 0),
(205, 'Christophe ', 'Marko', 'MI', 4, '$2a$08$1ybBXtNF8m2cCvCQkypvuOsVq.NZxDa/EZhFqrz2Si.TCIF0E7gva', 25000, 'christophe.marko@etu.umontpellier.fr', 1, 0),
(206, 'Olivier', 'Manco', 'MI', 4, '$2a$08$9r.Bjx8V2Bqfobr0JquKYe6.gTp.q71vygCkoCWHfHsJM.P8pVzRq', 25000, 'olivier.manco@etu.umontpellier.fr', 1, 0),
(207, 'Sélim', 'LUCAS DE L', 'PEIP', 2, '$2a$08$pV3/6Wx7Ta86h75gUb8.mekCPuFEn1OomiZG.jadrXy6YrUR37J4u', 25000, 'selim.lucas-de-leyssac@etu.umontpellier.fr', 1, 0),
(208, 'Marjorie', 'Souque', 'STE', 4, '$2a$08$D8nO5dbZlyiMtAYjh0AAnejNiQopj4hUA14o7zKN07EF.oK5iw4IO', 25000, 'marjorie.souque@etu.umontpellier.fr', 1, 0),
(209, 'Jade', 'VANDAL', 'MI', 3, '$2a$08$/nC4IGN0d66UDCdyhRaYr.2hWZjUQ/fKT1dG.ZMEmOmdN69TEB7am', 25000, 'jade@etu.umontpellier.fr', 0, 0),
(210, 'Jean-tricheur', 'Antoine Sanchez', 'IG', 2, '$2a$08$dvQhkG5VZXa/Z0Kr51RU6uzQ2ZYl2MPsoZKdfso5K309qn1lgUxGO', 25000, 'antoine.sanchez@etu.umontpellier.fr', 1, 0),
(211, 'Axelle', 'Reysset', 'GBA', 4, '$2a$08$poJqZmSbJboXEzcIzjOSPezN5M8ErR1TlJ5ll6TeQ/.vb6qcYhRyG', 25000, 'axelle.reysset@etu.umontpellier.fr', 1, 0),
(212, 'Lucie', 'Artigues', 'MAT', 4, '$2a$08$mzSLNTi1CO6/nuJza0SN0uiLEmYgaLU203qLIpR/RoKUzIHRiKz4q', 25000, 'lucie.artigues@etu.umontpellier.fr', 1, 0),
(213, 'Heloïse ', 'Teil', 'PEIP', 2, '$2a$08$j5ZnEuMSpvs/kV3bsjj5XOlIu3UUaSC9PALIwn8FQNCwxRLDTNYzu', 25000, 'heloise.teil@etu.umontpellier.fr', 1, 0),
(214, 'Andrea', 'De Ortiz', 'MAT', 4, '$2a$08$AKLZHZW3LHMB3UxQKId.4O1ZzOdn8GGVws2uh72MWlnrVFnb5eTj.', 25000, 'andrea.de-ortiz-georges@etu.umontpellier.fr', 1, 0),
(215, 'Anaïs ', 'Andrianjatovo', 'GBA', 4, '$2a$08$Q0P.T2mkl9rilN1lBlwWmOIuep.d5octROHct1LdzXBGduczmnexC', 25000, 'anais.andrianjatovo@etu.umontpellier.fr', 1, 0),
(216, 'Angele ', 'Sery', 'PEIP', 1, '$2a$08$QSxAGhHZ2YXscuZKdGCd2eh7TqlnXVKhpxi1kKN2GRDwM2SZG6bBu', 25000, 'angele.sery@etu.umontpellier.fr', 1, 0),
(217, 'Léon', 'Hocquemiller', 'MEA', 4, '$2a$08$Zs9iK9awsZfyd6V9RzCFP.B3CXooXvlazIX4ul/saVrl7l/c535DS', 25000, 'leon.hocquemiller@etu.umontpellier.fr', 1, 0),
(218, 'Enzo', 'Fabre', 'IG', 4, '$2a$08$Km4ny0ZcBKkBxtmDnRql1O6mCSopT40uTIbGs78wzDL.shU7mWt1a', 25000, 'enzo.fabre@etu.umontpellier.fr', 1, 0),
(219, 'Julia', 'Favrel', 'IG', 5, '$2a$08$CvPK.2LDQB0alNrz6dQ9cOUfATe2C4o4aMpLIUQynTUNZr9L2XqxS', 25000, 'julia.favrel@etu.umontpellier.fr', 1, 0),
(220, 'Solene', 'Gronnier', 'GBA', 4, '$2a$08$s7ywtJNr05vzI8GbBkiAaePMXvovqXf4S9i8teSFRsrBlEmf0BlO.', 25000, 'solene.gronnier@etu.umontpellier.fr', 1, 0),
(221, 'Quentin', 'Ponzo ', 'PEIP', 2, '$2a$08$td7T7kEMlpirw9/AV/1xm.98wHjEzAcUGFQjsB2LfP0Z3lZY0RqlK', 25000, 'quentin.ponzo@etu.umontpellier.fr', 1, 1),
(222, 'Ludivine ', 'Evreux', 'GBA', 4, '$2a$08$pwfam1Q4wVBzfoxIIYQbYep1hMYCcgWqMqag0XlOpb31jVTdHcdsC', 25000, 'ludivine.evreux@etu.umontpellier.fr', 1, 0),
(223, 'Leo', 'PERNELLE', 'IG', 5, '$2a$08$RxjJ3kX6uKiqsdQBc6nyIOx2Jhsbzky4xmMyhAxMlhCMvdXYvsfyy', 25000, 'leo.pernelle@etu.umontpellier.fr', 1, 0),
(224, 'Hugo', 'Chabert', 'MEA', 3, '$2a$08$3OM6ioCEwyTV81B2226NYOGcoSSYJ3uPdPvEdZbq4o/XAUFpjjzjW', 25000, 'hugo.chabert@etu.umontpellier.fr', 1, 0),
(225, 'Alia', 'Chawaf', 'IG', 3, '$2a$08$D085Ur4ff6TnlhXpiSvkCuc8X16vx6b6.yv1ZHvLT6zmyegi147.y', 25000, 'alia.chawaf@etu.umontpellier.fr', 1, 0),
(226, 'Léo', 'Folliot', 'PEIP', 2, '$2a$08$Izvp0DNk7J2TDvMwx1ONeuzSZyE6NoFFB5A7nSTGSlW/I1nUSkhLe', 25000, 'leo.folliot@etu.umontpellier.fr', 1, 0),
(227, 'Etienne', 'Dayet', 'PEIP', 2, '$2a$08$DntRhv6Y9XwIZv1L2rXoi.EARMrxnxwT6couS4AG1Tv8HHc.uAjIm', 25000, 'etienne.dayet@etu.umontpellier.fr', 1, 1),
(228, 'Thomas', 'Cormier', 'PEIP', 2, '$2a$08$LPVIJxM6ZFJXfseNGuKQH.P.8q5pgmJUcx/Swrpzk1or1.CWmxuOu', 3524, 'thomas.cormier@etu.umontpellier.fr', 1, 0),
(229, 'Erick', 'Taru', 'IG', 5, '$2a$08$xaqx34ou9.O.R1FifRRYluL5r6WW6tgksnCfU4W7L.hDQab/mcKRu', 25000, 'erick.taru@etu.umontpellier.fr', 1, 0),
(230, 'Celia', 'Cornac', 'GBA', 3, '$2a$08$7Y1wV.297A0PqNaXK4hZSOsu5rE1TeWFcb4hYXOoBwnzmOe0Seqom', 25000, 'celia.cornac@etu.umontpellier.fr', 1, 0),
(231, 'Laurie', 'VIGNOLO', 'GBA', 3, '$2a$08$A0WpQyBqgHQzd.U.EJO3EOD0Vmw1BmCNXfDUcei6Sf.ZWom5mtuEO', 25000, 'laurie.vignolo@etu.umontpellier.fr', 1, 0),
(232, 'Alice', 'Burette', 'IG', 3, '$2a$08$G7XOHbnbq.S9Sz7xv3dNxu1CYn/g1vl/CnKSbqNPW4ds74mOjFWgG', 25000, 'alice.burette@etu.umontpellier.fr', 1, 0),
(233, 'Nicolas', 'PIC', 'STE', 4, '$2a$08$GMwsHmhocDo4MQZCr5eBruqrQ1w2XibIy8JhhE4bbcCzvihl3XCa.', 25000, 'nicolas.pic@etu.umontpellier.fr', 1, 0),
(234, 'Thibaut', 'Allard-Serre', 'IG', 3, '$2a$08$KBn7gERoFy4bYbvTBW9vTeOpglMzd2qNfo60yDnFqabXwUnhzRAT6', 25000, 'thibaut.allard-serre@etu.umontpellier.fr', 1, 0),
(235, 'Audrey', 'Vanderstichelen', 'GBA', 5, '$2a$08$1cJkjGQreBgfFoc73EvARuMNacjHa/a8WvzZnYxS7LhTTh2qSm3uK', 25000, 'Audrey.vanderstichelen@etu.umontpellier.fr', 1, 0),
(236, 'Jane-Iris', 'Bedouet', 'GBA', 3, '$2a$08$MDq3862V/Rcn0MCpA34eDuHmzRDxCP3sNf7v1eNkc.Mg3OglSuU1S', 25000, 'jane-iris.bedouet@etu.umontpellier.fr', 0, 0),
(237, 'Baptiste', 'Théau', 'MEA', 4, '$2a$08$iF/qChXoEou2v/2JTtnSheNwN/wcr7Veud4C6GdG5tIHDSJmpcQfi', 25000, 'baptiste.theau@etu.umontpellier.fr', 1, 0),
(238, 'Mathias', 'Aubert', 'MAT', 4, '$2a$08$t/LvuJELxVogd1AG4Rg99ejtpFZfUgQnpSnxs2oZZ7Pj.56Gr6SqO', 25000, 'mathias.aubert@etu.umontpellier.fr', 1, 0),
(239, 'Razmo', '4ever', 'IG', 5, '$2a$08$vximfAhZRThFGhZNP0ZiqOQLGpPtEUN0zP0kJXQZlGquO7zGIUz8W', 25000, 'jean.brute-de-remur@etu.umontpellier.fr', 1, 0),
(240, 'Paul', 'Kirren', 'MAT', 4, '$2a$08$ELmN5.OzdjNbOwyiep7SweJZLkCO7hmFcKmwjg.ei01FPLlq1V5TG', 25000, 'Paul.kirren@etu.umontpellier.fr', 1, 1),
(241, 'Jérémy ', 'Morand', 'MAT', 4, '$2a$08$FyTfwv/MzlG/rDgj6BiRyOJO1CVDguYp.QnlQnlFrcfYUeUOZMp6C', 25000, 'jeremy.morand@etu.umontpellier.fr', 1, 0),
(242, 'Justine ', 'Foulquier ', 'PEIP', 2, '$2a$08$zkkdE0As90OLLcvnkF5lqeK.96Y/S5qGdcEJMhpt/AdPDEq8tsha2', 25000, 'justine.foulquier@etu.umontpellier.fr', 1, 0),
(243, 'Manon', 'Chaix', 'PEIP', 2, '$2a$08$G2dENnLFbgy7bHsukbo6/eCRDszQ7xLMkikV5gC/4SNCEY8R5cPSK', 25000, 'manon.chaix@etu.umontpellier.fr', 1, 0),
(244, 'Malaurie', 'Geraud', 'PEIP', 2, '$2a$08$WgllsOu5Bh.JXKbWb09j.OyGbGszAbZQSZ.UHc8iZJK92iekCGjQi', 25000, 'malaurie.geraud@etu.umontpellier.fr', 1, 0),
(245, 'Abdoul Aziz ', 'SOW', 'MI', 3, '$2a$08$MZhd1x5.khCxk2Hob0tm5O2CkIhmUvnzTotANnu4QvF/fttysLzsm', 25000, 'abdoul-aziz.sow@etu.umontpellier.fr', 1, 0),
(246, 'Jeanne', 'Didot', 'PEIP', 2, '$2a$08$T4eHACcjcJ0JUrFOZQ86hO/9h.be3uClGPYPvsKbzdCAUOYBqrn1e', 25000, 'jeanne.didot@etu.umontpellier.fr', 1, 0),
(247, 'Audrey', 'Crusson', 'GBA', 3, '$2a$08$QWv3swVAbtlo0kfIUiTOneL4LSVFge49bdE0Q7eFmBRrVFXzp9CzO', 25000, 'audrey.crusson-aguero@etu.umontpellier.fr', 0, 0),
(248, 'Fadoua', 'Hamouachy', 'MEA', 4, '$2a$08$OWoduzNx8JJpJRgqsPfzkegfoRpYAl0Lbdev1l1XYaPr4XXfCx2Ku', 25000, 'fadoua.hamouachy@etu.umontpellier.fr', 1, 0),
(249, 'rayan', 'bahroun', 'IG', 3, '$2a$08$3cEwyecIbVNK9uIWgVpOiurWLajJS06a/mIfjzMtzuYi6CYcxUoAm', 25000, 'rayan.bahroun@etu.umontpellier.fr', 1, 0),
(250, 'Clement', 'Larmandieu', 'GBA', 5, '$2a$08$Om9U6xE1ayQ0LWk0JKCuYur1aq/WKzhWFfZsxtBtTL7goOsMWoiFW', 25000, 'clement.larmandieu@etu.umontpellier.fr', 1, 0),
(251, 'Morgane', 'Finiels', 'PEIP', 2, '$2a$08$XhvoUh8QUjMENCkx9pJKXeVDB0eV3bOgT6RZ/SrxoWUGo4eUNbA/S', 25000, 'morgane.finiels@etu.umontpellier.fr', 1, 0),
(252, 'Jeremy', 'Dejeanne', 'GBA', 4, '$2a$08$Jhd4HAb1GQNWON2YFw/3vuVNPiLiE4D91j6muyI6dt9NCG5pi9YFi', 25000, 'jeremy.dejeanne@etu.umontpellier.fr', 1, 0),
(253, 'Laure', 'Freyche', 'PEIP', 2, '$2a$08$WlP6wMaK2RiwDMC3JHT.P.KQIP4lQBkDag61Fylu8Y.5YgffUl82u', 25000, 'laure.freyche@etu.umontpellier.fr', 1, 0),
(254, 'Térence', 'Rousset', 'PEIP', 1, '$2a$08$m08USnxju.KI83wkl.oX/eMAoYTnV9y6j0NxFdvahUyKkXhZSKdgK', 25000, 'terence.rousset@etu.umontpellier.fr', 1, 0),
(255, 'Coline', 'Bonneu', 'PEIP', 2, '$2a$08$bCHQt571t6Pgc8H3Il1AUegsw.k93vs3/KiREvas3c9FKXmEjDRVm', 16560, 'coline.bonneau@etu.umontpellier.fr', 1, 0),
(256, 'Achille', 'Bourgne', 'PEIP', 2, '$2a$08$VUAqPmHT9GlHbWyah5cpNO6QI2VnjZJGU2RRd/utit9.IlZLK6EUm', 25000, 'achille.bourgne@etu.umontpellier.fr', 1, 0),
(257, 'Alexis', 'Andre', 'PEIP', 2, '$2a$08$QSG5a73I8ezCBE2cJrRbIOTkDt7KPMbcsw0s47kWja7Gn0JCTDjNC', 25000, 'alexis.andre@etu.umontpellier.fr', 1, 0),
(258, 'Mathis', 'Bourrat', 'PEIP', 2, '$2a$08$keAilsZRwhrTpEoV/lZS.uiUuqSr7zKbK4GpyZhctpNxJBzpGLbiu', 25000, 'mathis.bourrat@etu.umontpellier.fr', 1, 0),
(259, 'Alexandre ', 'Gardes ', 'PEIP', 2, '$2a$08$tO3ZQgF73C7HykKYwlbJXeSx0Ie5ftEdaNTOmb384iloNQg4ooXO2', 25000, 'alexandre.gardes@etu.umontpellier.fr', 1, 0),
(260, 'Thomas ', 'Pourchaille ', 'PEIP', 2, '$2a$08$dIAx8Y385WyKKGV1Os6rleoLLlakB.DjR4OouslRXBV.EYC6/CQ1W', 25000, 'thomas.pourchaille@etu.umontpellier.fr', 1, 0),
(261, 'william', 'Cain-rossow', 'MAT', 3, '$2a$08$h0XpB.dj8VXlmxZ3vT/Y6OfZUzrsDFli5i.xMPltaz/8OctnOdeUq', 25000, 'william.cain-rossow@etu.umontpellier.fr', 1, 0),
(262, 'Robin', 'Sales', 'PEIP', 2, '$2a$08$Zh7n0PdRoEfeoQxnFwSjkuhETmcgjdFP8PGxQ7ymJM1cj6tsqeQp.', 25000, 'robin.sales@etu.umontpellier.fr', 1, 0),
(263, 'Célestin', 'Tisserant', 'PEIP', 2, '$2a$08$Z0npizRmpMNuVVQQmWl4qu0ZbgsbpEyzEvmX2AFEVoHqSj11KuqsC', 25000, 'celestin.tisserant@etu.umontpellier.fr', 1, 0),
(264, 'Thibault', 'Chossis', 'PEIP', 1, '$2a$08$Hs4jGe/nu5iYxL9cOwVCvur91btpXlLQvb2l7g4wKM3IPyDOPqYz2', 25000, 'thibault.chossis@etu.umontpellier.fr', 1, 0),
(265, 'Lucas', 'Beaudrier-Lagarde', 'PEIP', 2, '$2a$08$6X4vnTyAptsqQzGsJ1jE5.juNvQIuz27wFPioZkMjh6Sbb5AxlvF2', 25000, 'lucas.beaudrier@etu.umontpellier.fr', 1, 0),
(266, 'alexandre', 'peraldi', 'PEIP', 2, '$2a$08$nGOtXlPsnA2zqV8svij99eoxBWxJSAHYxYFZv510jKrLdIrljHt2K', 25000, 'alexandre.peraldi@etu.umontpellier.fr', 1, 0),
(267, 'Jules', 'Bosse-Platiere', 'PEIP', 2, '$2a$08$GCQ3E2aEkRLYyFZMOtKcnuA.FdBnOuelcRuZQeXjk6q8k0yw6QOUC', 15080, 'jules.bosse-platiere@etu.umontpellier.fr', 1, 0),
(268, 'Elie', 'Couard', 'STE', 3, '$2a$08$eWjk2.4jig3H1BXG9aoVOujNQOyb5xwk9X.xqYbGExcWsoAyi/cQ6', 25000, 'elie.couard@etu.umontpellier.fr', 1, 0),
(269, 'Miguel', 'Young', 'PEIP', 1, '$2a$08$SWnnpzOmNa2aDH3koGC0D.QmCFmfWufGU76orkt.fR./ncFmaTHyq', 25000, 'luis-miguel.young-brun@etu.umontpellier.fr', 1, 1),
(270, 'Godefroi', 'Roussel', 'IG', 4, '$2a$08$ofUfsYsn7axx07WU89fKb.Kr93e2fLH5ZO7GvRwt4H49fpx19WcNW', 25000, 'godefroi.roussel@etu.umontpellier.fr', 1, 0),
(271, 'Lisa', 'Langin ', 'PEIP', 1, '$2a$08$5knv4SpNlBku0NcJaUQXF.5MHAAfvhM3VQZiZWkoEGVZb67.uqOk2', 25000, 'lisa.langin@etu.umontpellier.fr', 1, 0),
(272, 'Jérémy', 'OLIVIER', 'PEIP', 2, '$2a$08$YtnDKaqNQ1tL8fZQ4SaiLeWd27.5VgMarLfjc4/9BHLLMc1.V07XW', 25000, 'jeremy.olivier@etu.umontpellier.fr', 1, 0),
(273, 'Simon', 'Verquin', 'MAT', 3, '$2a$08$BF3g9kspPNkNza0.Z3mMWuIOAB2qtFd7nnAcHUqmQZZ8jjyrMPtDC', 25000, 'simon.verquin@etu.umontpellier.fr', 1, 0),
(274, 'Alexandre', 'Dubuisson', 'PEIP', 2, '$2a$08$w2GZSPFt62gkCVBr1v8mUeCR60Ibb9hpB0gSTxkBkLUdOZr1VvEGm', 25000, 'alexandre.dubuisson@etu.umontpellier.fr', 1, 0),
(275, 'Hugo', 'Brando', 'PEIP', 2, '$2a$08$BGlbygjoug6YEjEckqoE8eB5weaYxRBk/FY6NPrNl38LU9OSueHPu', 25000, 'hugo.brando@etu.umontpellier.fr', 1, 0),
(276, 'Pauline', 'Fournadet ', 'GBA', 5, '$2a$08$QgpcPRrr8BPkO1/KUKj7qeEOood2qxw5cyhcDNrgm3Bvp6YMw49tG', 25000, 'pauline.fournadet@etu.umontpellier.fr', 0, 0),
(277, 'Anthony', 'Bof', 'PEIP', 2, '$2a$08$xM6mFkHrl2C4t/.v4JF31.NFidP5Z8xBM.80DF5xVRShyKAj7tgsW', 25000, 'anthony.bof@etu.umontpellier.fr', 1, 0),
(279, 'Melvil', 'Donnart', 'IG', 4, '$2a$08$D89RjWulA/nxQzko0Tq9rO4jycvi0AEhiCDVm4Go51h8Xph5V/HsC', 25000, 'melvil.donnart@etu.umontpellier.fr', 1, 0),
(280, 'Guillaume', 'Grosjean', 'PEIP', 2, '$2a$08$y8kM./U8YEYow2qu74A0lOfPpDAycA6UbEZ65f.Wf30baA4e0oEMO', 25000, 'guillaume.grosjean@etu.umontpellier.fr', 1, 0),
(281, 'Pierre', 'Enjalbert', 'MAT', 4, '$2a$08$cie57jTDQwH7..R.msBviuLXqYfAqiqu9la2uv6kH7dng0q1ibD/6', 25000, 'pierre.enjalbert@etu.umontpellier.fr', 1, 0),
(282, 'Camille', 'BELLOT', 'PEIP', 2, '$2a$08$vzuBQevosvdVjtWysNEYce2MuL/tvgggzRuZXl3ZzYjXQ/o02HYdi', 25000, 'camille.bellot@etu.umontpellier.fr', 1, 0),
(283, 'Clément', 'Roig', 'IG', 4, '$2a$08$ROEoWbdn9CrQAM7wA6VgL.A5La7ns5BiJZBtHqZaB6yTmB/aOY4Ca', 25000, 'clement.roig@etu.umontpellier.fr', 1, 0),
(285, 'Jade', 'Hennebert', 'IG', 4, '$2a$08$MEtpMuZET4nRwS8Fzc4Dc.eoKRlint31lcyZSMfkPKXg0ldk6vwZO', 25000, 'jade.hennebert@etu.umontpellier.fr', 1, 1),
(286, 'Johan', 'Brunet', 'IG', 4, '$2a$08$8E/IAbMVZjqZtLIXw0s7QONPIdP9Chb6MGLOZ8nUyxHgRMxBqXxt6', 25000, 'johan.brunet@etu.umontpellier.fr', 1, 1),
(287, 'Maitre', 'Hugo', 'IG', 4, '$2a$08$7O4/NfQ.g2uLObFPDDiEhuJVcLB4r0bE5c.Ft1DT7wgQwId1PhW3S', 25000, 'hugo.maitre@etu.umontpellier.fr', 1, 0),
(289, 'Aude', 'Pujol', 'GBA', 4, '$2a$08$YelPlHPy9WrbRloFXAEk.e4tj8YfArrYwOW5bV/Af8DEjwaAN.QbK', 25000, 'audepujol@etu.umontpellier.fr', 0, 0),
(290, 'Anissa', 'Lamh', 'IG', 3, '$2a$08$fvz5xUs5Ks0uy4fPG2.SB.4Khg9Hm/0edqLaT1ekWp0frEUGjjD/K', 25000, 'anissa.lamhaouar@etu.umontpellier.fr', 1, 0),
(291, 'Ludovic', 'Llanes', 'PEIP', 2, '$2a$08$Di5aqUR4s5xLSYlsEufA1uely07TAcG0QZKtIMXnW5Rs.Azqlzjn.', 4928, 'ludovic.llanes@etu.umontpellier.fr', 1, 0),
(292, 'Elise', 'Tassart', 'MAT', 4, '$2a$08$JZvFVVWrWg8CgjrLgDWgd.OqLJHUwkQ9vRCN8Cs8vVfOzYiAD7YL6', 25000, 'elise.tassart@etu.umontpellier.fr', 1, 0),
(293, 'Lucie', 'Marche', 'MAT', 4, '$2a$08$aAgune3C/d/JkKY8ynpbYer20nJFjiKC0fovjDwv5BnW5BVUFD0ym', 3840, 'lucie.marche@etu.umontpellier.fr', 1, 0),
(294, 'Simon', 'Cuny', 'MAT', 4, '$2a$08$QJmwEtAhOIchpGT92sRKfukRHZ3xKydbic/QG7L/8iY/oPZ8rzFoW', 25000, 'simon.cuny@etu.umontpellier.fr', 0, 0),
(295, 'Vincent', 'BONILLA', 'MI', 4, '$2a$08$XcAW69mVSA1tCu5IktbObON0sVhCMJYrYibKpBTSSvctjdpHYvjqC', 25000, 'vincent.bonilla@etu.umontpellier.fr', 1, 0),
(296, 'Romane', 'Coquiot', 'GBA', 4, '$2a$08$t.g7AOaTcLvEB/XFAve59ubZw.n/JrsdAqfTnKjOn2fRb0XZab3V2', 25000, 'romane.coquiot@etu.umontpellier.fr', 1, 0),
(297, 'Lina', 'Loukili ', 'GBA', 3, '$2a$08$iTzm9QqvUKOGWDH3LCXl7OJXK12SYFUXl5dLrCdfxd02xXZRdSwSW', 25000, 'lina.loukili@etu.umontpellier.fr', 1, 0),
(298, 'Helene', 'Girardat ', 'GBA', 3, '$2a$08$DH3XwNFj5YAah8eI/WqwoOxhGrbT5tHiCvTvPtWhKWdABFW5A9Iau', 25000, 'helene.girardat@etu.umontpellier.fr', 1, 0),
(299, 'Jean', 'Bruté de Rémur', 'IG', 5, '$2a$08$/W7NXYy4U4G1zJ0R6CijTeTC2G.6AQPQz90mU8aPoo.bJUHOaw6Qu', 25000, 'jean.brut-de-remur@etu.umontpellier.fr', 0, 0),
(300, 'Julie', 'Chiarabini', 'GBA', 3, '$2a$08$q.mWs92MKxZWJj9ukY9jQ.9FnO081XE.y.EAml.7t1j/dgU6hCA8e', 24440, 'julie.chiarabini@etu.umontpellier.fr', 1, 0),
(301, 'Emma ', 'Picchiottino ', 'STE', 4, '$2a$08$pRsVPZO7/YsJ5XqWx3FSzOhot/zqAwvN0Ssjc4Ws2RiDINRKM4Pfi', 25000, 'emma.picchiottino@etu.umontpellier.fr', 1, 0),
(302, 'Theo', 'SIMONET ', 'MI', 4, '$2a$08$Qupv158FQNijMqFdpvWZr.PEWkAedEtGnyLBTlSmVO4ZtxNkuKvLa', 25000, 'theo.simonet@etu.umontpellier.fr', 1, 0),
(303, 'Margot', 'Pons-Eblé', 'GBA', 4, '$2a$08$ZztRqn8mhAhjxLjaU.cbIOB7DTvvWy9tKmTgS8o7yNhsfg2OmYIiG', 25000, 'margot.pons-eble@etu.umontpellier.fr', 1, 0),
(304, 'Eva', 'Lasmayous', 'GBA', 4, '$2a$08$du06MdgzIGOzgoLTfqr36uDNmafk1iPrV3qurcBTlOBvyA8ej2cYu', 25000, 'eva.lasmayous@etu.umontpellier.fr', 1, 0),
(306, 'Guillaume', 'Cuq', 'MI', 4, '$2a$08$NJtU.DWJRUPQ1IRN437aZ.jDEtedL/dTs.yNs/frFb/CCNvgLHAga', 25000, 'guillaume.cuq@etu.umontpellier.fr', 1, 0),
(308, 'Loris', 'Zirah', 'IG', 4, '$2a$08$.ykc3ktEV76bY/aZQE0/TuzJ09y3vGJBt8iHrG8Ef4ufAI6OI/lHm', 25000, 'loris.zirah@etu.umontpellier.fr', 1, 0),
(309, 'Alban', 'Le Piver', 'PEIP', 2, '$2a$08$.RUIPNpHrI4E5euS/scMReX6CLSXgPb2B0HHi2f4MhGImI8xoJAlG', 25000, 'alban.le-piver@etu.umontpellier.fr', 1, 0),
(310, 'Marina', 'Masson', 'STE', 3, '$2a$08$fNJ1xGHuHcD5iBCC45om0ucxj3tzhFKjJL5Tn53thPSeUZk9UBqtu', 25000, 'marina.masson@etu.umontpellier.fr', 1, 0),
(312, 'Marie', 'Aillaud', 'GBA', 3, '$2a$08$QgwA1mXUKu9PEbiZV/7kzuBWtC62jIMsR7soouNeKNrq73FlqElt6', 25000, 'marie.aillaud@etu.umontpellier.fr', 1, 0),
(316, 'Estelle', 'Pachoud', 'GBA', 4, '$2a$08$ntXnpgv2HFf0mlT.II0SFeAUYIvGttMeaLiDUE9ytg.LAGDAXcS1a', 25000, 'estelle.pachoud@etu.umontpellier.fr', 1, 0),
(353, 'Lise', 'Freychet ', 'STE', 4, '$2a$08$gWAe4lOBWQ5TbDFVQi9W6e347KFgZaXud4Xms9/N0llnu5BLZa.Ui', 25000, 'lise.freychet@etu.umontpellier.fr', 0, 0),
(499, 'Gaétan', 'HOFF', 'STE', 5, '$2a$08$y1IyZg6v5h.vxShXuAIAwOJYu0IOgBIaI4yOwldxO2SP2JzTDC7SC', 25000, 'gaetan.hoff@etu.umontpellier.fr', 0, 0),
(733, 'Fatima', 'Machhouri', 'IG', 3, '$2a$08$1xlXv3pH.rJrQslgh.TCUeiS3PtjaIzLmb4FNUAoZAtgKEXaqlkty', 25000, 'fatima.machhouri@etu.umontpellier.fr', 1, 0),
(734, 'Baptiste', 'Vautrin', 'IG', 5, '$2a$08$Nug61vtWqW52lCS3vctmhubKtwKHdOv.dPKytqgb5899qT9AvQJFu', 25000, 'baptiste.vautrin@etu.umontpellier.fr', 1, 0),
(735, 'Fabien', 'Turgut', 'IG', 4, '$2a$08$.UDSYJN8d6lPn/yCBwIc0.lKg1nRO7HFjhyX7fTUTPjHSmSka6Nt.', 25000, 'fabien.turgut@etu.umontpellier.fr', 1, 0),
(737, 'Marion', 'Rovere', 'GBA', 4, '$2a$08$Mh25wG8vpLgqwnmps3q.3uqMAJw8P/RJdIzK9aA3rCyzfuCVdlmHi', 25000, 'marion.rovere@etu.umontpellier.fr', 1, 0),
(747, 'Valentin', 'Bruère', 'MAT', 4, '$2a$08$lxTyx/kg2OVeA8871GVLcOpqVe6ldZhCpdeIDs9T1A92izH2KqXI6', 25000, 'valentin.bruere@etu.umontpellier.fr', 1, 0),
(1269, 'Brigitte ', 'La chaise ', 'GBA', 5, '$2a$08$gAqgsvfLiZO3FSbGqlwjQu3soD8XlT8KKrKChDZvcxYqkFzeWCUJ2', 25000, 'brigitte.lachaise@etu.umontpellier.fr', 0, 0),
(1792, 'Tony ', 'Fernandes', 'MAT', 3, '$2a$08$5b.HO3Q4QGaUGr3JyFDYpucU9dt4W8WBZRCZ1y5tbVIYDnMComXRi', 25000, 'tony.fernander@etu.umontpellier.fr', 0, 0),
(2315, 'Aurélien ', 'Quillet', 'MAT', 3, '$2a$08$Bq954lCrw.lsn77RH/CFdOCkQAamyOfEnaIe8pywOXfzRP2GkGZTG', 25000, 'aurelien.quillet@etu.umontpellier.fr', 0, 0),
(2829, 'Clement', 'Tosi', 'MI', 3, '$2a$08$tNjHUnSApg4BcKkC1/f63eek9PHlgvkVgWHkeMY8CpsBU4w60B0o6', 25000, 'clement.tosi@etu.umontpellier.fr', 0, 0),
(2830, 'Samantha ', 'KITTERIMOUTOU ', 'GBA', 4, '$2a$08$nOHtB.AchfEgr27P6rIWPueexF8aO8HWzitw1J.bQ0ISJ42TG7TRy', 25000, 'samantha.kitterimoutou@etu.umontpellier.fr', 0, 0),
(4302, 'Loïna', 'Grondin', 'MAT', 3, '$2a$08$GwER1MG8wwA/od4gk.Olbuxt2nBScTvh3nJsZpGTHEpmKF4FaKRyO', 25000, 'loina.grondin@etu.umontpellier.fr', 0, 0),
(5002, 'Romain', 'Grosset', 'MI', 4, '$2a$08$6aJz0lW5TvtSSDlXqggp4uWO7KqpV6U/y5hFHGV7O8basB8CfpKzW', 25000, 'romain.grosset@etu.umontpellier.fr', 0, 0),
(5003, 'GUSTAVE', 'Mercat', 'PEIP', 2, '$2a$08$DxXu9ftT74WFCJk/1DRvOOl1NcpJknczGi.pUTzKqSk5fjUqUWDeS', 25000, 'gustave.mercat@etu.umontpellier.fr', 0, 0),
(5004, 'Emelyne', 'Chabat', 'STE', 3, '$2a$08$XibIXqD6aknAHtmvB/SHZuuMZrq6KHdfepKkGRhp.RXx5xmACfkpu', 25000, 'emelyne.chabat@etu.umontpellier.fr', 1, 0),
(5005, 'Toinon', 'Georget', 'IG', 4, '$2a$08$jJJKzgYSq1mIT2AiDbepAerjUvZv7bRXfSw1cpVfdZyhCdJ9Skoy6', 25000, 'toinon.georget@etu.umontpellier.fr', 1, 0),
(5013, 'Quentin', 'Boulard', 'MAT', 4, '$2a$08$c30k2xxYildxpQp9jhFv9.fTeLybKfT22ZkWoId8ryWZ0X9YPmLXi', 25000, 'quentin.boulard@etu.umontpellier.fr', 1, 0),
(5017, 'Etienne', 'Dup', 'MEA', 5, '$2a$08$ATZw5DLXGQ.WLw5OXIEt2O6JEQVQU8o4phtYxujpPQ2o2ryue4sMy', 25000, 'etienne.dupuis@etu.umontpellier.fr', 1, 0),
(5018, 'Marie', 'Thevenon ', 'STE', 5, '$2a$08$7/8grxPMhBMSTOi/y1UzJOd61rYunkdLCNe/4sPphItUMmVwVAwYK', 25000, 'marie.thevenon@etu.umontpellier.fr', 0, 0),
(5019, 'Marine', 'Dupre ', 'MAT', 4, '$2a$08$N.iLSjH3VoRXJ1h6DbXecexbNqF9Se4hNsGlyRthBsgocgTKEBez2', 25000, 'marine.dupre@etu.umontpellier.fr', 1, 0),
(5190, 'Leana', 'Filippi', 'PEIP', 2, '$2a$08$qk1dDNShIyoBDwobio8GyeOzvORfs0KLOJ0miGquavKRKslRNY9Ue', 25000, 'leana.filippi@etu.umontpellier.fr', 1, 0),
(5191, 'Juliette', 'Benichou', 'PEIP', 1, '$2a$08$vK8/XWYkVFWqUP2IPvnQQOUDHpvqW/jAFV7xeqbt22dpOdaMgsklW', 25000, 'juliette.benichou@etu.umontpellier.fr', 1, 0),
(5192, 'yashveer', 'teeluck', 'PEIP', 2, '$2a$08$C/ttecJLHrwFR/TeAx6PUe5FQR42DOsPPTr08YoMp0jtn2Hk9uAtK', 25000, 'yashveer.teeluck@etu.umontpellier.fr', 1, 0),
(5193, 'Mathilde', 'Mainet', 'GBA', 4, '$2a$08$5M1L7p7gzf1uQYk5PmLh.uxu9VWdPsHy0gTSq38YEsIM7WUEI8zE.', 25000, 'mathilde.mainet@etu.umontpellier.fr', 1, 0),
(5194, 'Laetitia', 'Perez', 'GBA', 4, '$2a$08$pR3C8WkD5YRd6hbn0LqC7OpPGcBqHozPMnDH2zZ6IcqNUEN65ZqtW', 25000, 'laetitia.perez@etu.umontpellier.fr', 1, 0),
(5195, 'Léa', 'Megherbi', 'PEIP', 1, '$2a$08$CzLVEKjTfCbiJpw5O16cTus9VKKDMBhegUWpxACJfV6IT1mSDnFBm', 25000, 'lea.megherbi@etu.umontpellier.fr', 1, 0),
(5196, 'Marion', 'Gros', 'PEIP', 1, '$2a$08$2E4Iv0sgR/gaXpSDKNqeveLMbHcfhLgO/NITzI.6k7/59yeqeKYl2', 25000, 'marion.gros01@etu.umontpellier.fr', 1, 0),
(5207, 'Aymeric', 'Lavedrine', 'PEIP', 1, '$2a$08$5nNPh/cdKfUeE2M/M30uj.VtAZBKwFIZ6xQofQdfh/bIauj8zQadS', 25000, 'aymeric.lavedrine@etu.umontpellier.fr', 1, 0),
(5208, 'Antoine', 'Vernier', 'PEIP', 1, '$2a$08$g07QVTd8fXVH6EFLcXGGb.rz8K3lKzkBj6HnDaDZgyyLDESoinSn.', 25000, 'antoine.vernier@etu.umontpellier.fr', 1, 0),
(5209, 'Adeline', 'HO-WEN-TSAI', 'STE', 4, '$2a$08$EB4UFod9m2jtOGk7mAXjYOP1dIgjBg7tGP2iDrEQV2Uvd2kdGP71G', 25000, 'adeline.ho-wen-tsai@etu.umontpellier.fr', 1, 0),
(5210, 'Florian', 'Saintomé', 'GBA', 3, '$2a$08$DuoQIA2W4pnZ7v5fQwZKLuX/2tryRBgVPv8TZk1tZn.Tv12Wnyos.', 25000, 'florian.saintome@etu.umontpellier.fr', 1, 1),
(5211, 'Thibaut', 'Galvin', 'MEA', 3, '$2a$08$8QutuLxQFtcz8FWirhpA4.ytL5OiBm/q/Xixqhx6CVOv0VD.8SMwi', 25000, 'thibaut.galvin@etu.umontpellier.fr', 1, 0),
(5212, 'Melvyn', 'Fowell', 'PEIP', 2, '$2a$08$5dc1I5WdEnsS3S7MEWpxSOKG7ZQ3hDxgjMCwi/7jXpllK0RYl0GBK', 25000, 'melvyn.fowell@etu.umontpellier.fr', 1, 0),
(5213, 'Lucas', 'Mathieu', 'STE', 3, '$2a$08$M.NjdHSm0xnTyMh0yfTy4O8oHF0Hcdqmckt0iPOVu6GZg1DBI12I.', 25000, 'lucas.mathieu@etu.umontpellier.fr', 0, 0),
(5214, 'temoana', 'menard', 'MI', 4, '$2a$08$rM5qtYtqp.eEgSFhxXXXGeKhM6O3TxKX8dln/eJ7TbRnbddUrTlCq', 25000, 'temoana.menard@etu.umontpellier.fr', 1, 0),
(5215, 'Christophe', 'Castaing', 'MAT', 4, '$2a$08$/074pvqSWBBT.6azJzby3efkE3.UL8k9.MJMnk5RVl4KWuxRBa8ce', 25000, 'christophe.castaing@etu.umontpellier.fr', 1, 0),
(5216, 'Laura ', 'Tabourin', 'GBA', 3, '$2a$08$ye3oZ/d7.9phYj.jXqu/2.9944AsuL1X.Xp4vQBGNlt4xgSD/zSbS', 25000, 'laura.tabourin@etu.umontpellier.fr', 1, 0),
(5217, 'Thomas', 'Corbet', 'MAT', 5, '$2a$08$1XPhp044CQOqQgACAyJlUuPUBGdDRVcob1.Q5Be1RCCBjX75MJSSS', 25000, 'thomas.corbet@etu.umontpellier.fr', 1, 0),
(5218, 'Camille', 'Taute', 'MEA', 3, '$2a$08$ETams2yStrK6EkqzbJLR1ugqvALGHugUmGeVMjyNye5pYBzVyUXKC', 25000, 'camille.taute@etu.umontpellier.fr', 1, 0),
(5219, 'Camille', 'ROULEAU', 'STE', 3, '$2a$08$nIwGK.rs3msabxRTs9OSHuYvcNf9jCQeO7yeDDKrH.VDwRE2BwSXW', 25000, 'camille.rouleau@etu.umontpellier.fr', 1, 0),
(5220, 'Alex', 'Simon', 'MEA', 4, '$2a$08$KvAsnVoFzqNkwp9sHrT1Wu7s3c5ePmBra17uWfvYCkrW3bGMaV1Q2', 25000, 'alex.simon@etu.umontpellier.fr', 1, 0),
(5221, 'Alexandre', 'Brihaye', 'PEIP', 1, '$2a$08$oh01rGiRyYx7esR96kvuEOYoiuzPvG9TQH98q0ozX6puTG2jPsRdi', 25000, 'alexandre.brihaye@etu.umontpellier.fr', 1, 0),
(5222, 'Paul', 'Contremoulin', 'IG', 4, '$2a$08$fSk2on5nekxtk1UgMb8f9.u.NTnuebo9jBfsoRlM4K4iwKNGZ78Y2', 25000, 'paul.contremoulin@etu.umontpellier.fr', 1, 0),
(5223, 'Vincent', 'Causse', 'PEIP', 1, '$2a$08$kvDlTJxnfABk4BOLuEhq9e82OZsWD5JYZYGOCJszIdTRgSYz1ye92', 25000, 'vincent.causse@etu.umontpellier.fr', 1, 0),
(5224, 'Rémy', 'Roche', 'MEA', 4, '$2a$08$l05hPYQyZ6C6zYqnQwK23.ZX5OYJbTxXkFKOjtNErMvC7t.RBkJUW', 25000, 'remy.roche@etu.umontpellier.fr', 1, 0),
(5225, 'Paul', 'Chaillou', 'MEA', 3, '$2a$08$e/Z98QKraGBgoLRfWF7rfuiM4ZQPtWwmoGwMtRGpB2ZUmslvUIHo.', 25000, 'paul.chaillou@etu.umontpellier.fr', 1, 0),
(5226, 'romain', 'bagnard', 'STE', 3, '$2a$08$oRujpkKjGvI/bgSAARxKoO.9J8ShjKE.2ua/RS2LM4PHNA0PshiyS', 25000, 'romain.bagnard@etu.umontpellier.fr', 1, 0),
(5227, 'Jean', 'Pablo', 'EGC', 4, '$2a$08$YrtWG85B/v9xsK8V18z0GeiIH2vpydBIWQvPQhSVKrcoWqZ7JSqdG', 25000, 'a@etu.umontpellier.fr', 0, 0),
(5228, 'Clara', 'Camel ', 'GBA', 3, '$2a$08$nHdFEzzuxDkEdtdCmN9ju.SL80ychJ9H822vj.wPAN72JdgRGod/q', 25000, 'clara.camel@etu.umontpellier.fr', 1, 0),
(5229, 'Benjamin ', 'Chanus', 'MEA', 3, '$2a$08$kFAxELfU/euW.hZxoCXTW.pGNvvDu.c.J9Pch/Q3o34NVjd/QXsVa', 25000, 'victor.malaquin-pau@etu.umontpellier.fr', 1, 0),
(5230, 'Adrien ', 'Cambos', 'PEIP', 2, '$2a$08$QNGHi.VOENtZi1aC6pGP0.zh700EdxemyTKcogcb7BDs8SNhEr8fG', 16320, 'adrien.cambos@etu.umontpellier.fr', 1, 0),
(5231, 'Thomas', 'Rival', 'GBA', 3, '$2a$08$lAPzcUc2BUJMbUqZ2X5Ty.yu.beU2bKKTE8G9GLLjhX5JJD9/CWYm', 25000, 'thomas.rival@etu.umontpellier.fr', 1, 0),
(5232, 'San Wei', 'Lee', 'IG', 4, '$2a$08$A76z5rPtIicGrlrqgZznb.UbUcFBPXFVEZTTXLb6IA1YcBPFdPn2K', 25000, 'san-wei.lee@etu.umontpellier.fr', 1, 0),
(5233, 'Quentin', 'Théo', 'GBA', 1, '$2a$08$9Xqa/9iMJ9nrnjCtf8t8A.DM/s7kTg8mgP2taAoRygVKXk51g2MaC', 25000, 'quentin.theo@etu.umontpellier.fr', 0, 0);
INSERT INTO `user` (`id`, `prenom`, `nom`, `section`, `annee`, `password`, `pizzaCoin`, `email`, `verifier`, `estBanni`) VALUES
(5235, 'quentin', 'théo', 'PEIP', 1, '$2a$08$NAWHF7VNPHPQldVmXmcX.OdZM7HT7ETWiU/kasQImLWWgEMNR37pW', 25000, 'lzaekozae@etu.umontpellier.fr', 0, 0),
(5236, 'Elyes', 'Doudech', 'IG', 4, '$2a$08$uBjid930/L/UaM6UWRUdq.3opSTaUf0eg4ZjYufdD2kgcJuu4TeXC', 25000, 'elyes.doudech@etu.umontpellier.fr', 1, 0),
(5237, 'Alec', 'Koepp', 'IG', 3, '$2a$08$Om8IWQPdPLFrEoW8N5Mgb.KbOoRja83byp/6NoyJ0WAK.M80GBL7O', 25000, 'alec-curtis.Koepp@etu.umontpellier.fr', 1, 0),
(5238, 'Nolan', 'Martin', 'MAT', 4, '$2a$08$aiFAYeCY15Ifcxl8dH/PmOwSaKx2f5HoprepfGuNe7mtT4lBjVhV2', 25000, 'natan.desmurs@etu.umontpellier.fr', 1, 0),
(5239, 'Valentin', 'Desbois', 'MAT', 4, '$2a$08$vwDyLX/W4/gx2/3xeEpC9Ok8OSeE1.xlv013kc9NB.DGxtklLPsrS', 25000, 'valentin.desbois@etu.umontpellier.fr', 1, 0),
(5240, 'Aurélie', 'Hodin', 'MAT', 4, '$2a$08$XoLau.2AmO/XdRPzZXkGpea0/ac/ZUwH0Edwq0zq.aOtb.w64HHaO', 25000, 'aurelie.hodin@etu.umontpellier.fr', 1, 0),
(5241, 'Léa', 'Daubagnan', 'STE', 3, '$2a$08$nTltdBqOu/0cbkaPvz6txeTPq9oHcm6a9n8wmBsN4oBJ3l8BbHbza', 25000, 'lea.daubagnan@etu.umontpellier.fr', 1, 0),
(5242, 'Léo', 'POITTE', 'STE', 3, '$2a$08$Y7NpBihx/wpIg9q2Mrcbl..QHKEJ3yZaQ2vY88caknpzOg1oj2ncW', 25000, 'leo.poitte@etu.umontpellier.fr', 1, 0),
(5243, 'Quentin', 'Fourcoual', 'MI', 4, '$2a$08$28pQs1sXnJDEEIZrg5ReOO9mByo5kh2QMygE7WXbqe.9/ax9HY59a', 25000, 'quentin.fourcoual@etu.umontpellier.fr', 1, 0),
(5244, 'Alexis', 'TACUSSEL', 'PEIP', 1, '$2a$08$7of6JK8wpa5klgJRCz0gK.0S4AuAOdbPNZoru64oDZem/fty9MxFK', 25000, 'alexis.tacussel@etu.umontpellier.fr', 1, 0),
(5245, 'Maxime', 'Vangrevelynghe', 'PEIP', 1, '$2a$08$zg7RYtsJ.yc5y6VMWCvVi.BgAsFXZ4Yj.OCP5Kj4ms1KvvXoCr7b2', 25000, 'maxime.vangrevelynghe@etu.umontpellier.fr', 1, 0),
(5246, 'julien', 'gallego', 'IG', 5, '$2a$08$HK4JDt1/0OhOZv6wnvUbvexVY5WX52eQ4Y8KKb8nx5rbd3ZtNmvbK', 25000, 'julien.gallego@etu.umontpellier.fr', 1, 0),
(5247, 'Greg', 'Barbon', 'MEA', 3, '$2a$08$2DgoYOWu0MIGXPX8oWAGaOSMzdbttRNcTLS7d7yWqQc7j5ETPHPfy', 25000, 'gregoire.barbon@etu.umontpellier.fr', 0, 0),
(5248, 'Victoire', 'Gache', 'STE', 4, '$2a$08$SCzMkGr7XuhA7pTuDF2WNOOmx18S4l4n.jU0NxYabA3XiLxVneJkO', 25000, 'victoire.gache@etu.umontpellier.fr', 1, 0),
(5249, 'Coline', 'Bergot', 'MAT', 3, '$2a$08$E6FDxzicGZ0EfxRQTLgsrOpAH/FvDV0FpY.I8Lhvcmx00F2uC07me', 25000, 'coline.bergot@etu.umontpellier.fr', 1, 0),
(5250, 'Solene', 'Babet', 'PEIP', 2, '$2a$08$tI16bj/OdcIPe8j6GBZUUuJWK1oCUeSQ2nuMLfheIRm2X5p4qP4xm', 25000, 'solene.babet@etu.umontpellier.fr', 1, 0),
(5251, 'Luis', 'Marian', 'STE', 3, '$2a$08$0DJ.eNuM8eTeKEuUADjxoOpsnmqn/zptyAb5WRhnHukp8OZGOR4Ca', 25000, 'luis.marian@etu.umontpellier.fr', 1, 0),
(5252, 'Tanguy', 'Mitchell', 'PEIP', 1, '$2a$08$lcRtALrGEnME67Nn8ZHFVOgZ41bwhXJMp6Q3AtcUiKKnmkgziNR96', 25000, 'tanguy.mitchell@etu.umontpellier.fr', 1, 0),
(5253, 'Guillaume ', 'Dufour ', 'PEIP', 2, '$2a$08$3GxH25WOnTenXcod1ffGqeB.on.GATF9R5fAfCguxNT52Gt9OIMsi', 25000, 'guillaume.dufour@etu.umontpellier.fr', 1, 0),
(5254, 'Loick', 'Nicolai', 'PEIP', 1, '$2a$08$SPnXS0nUfK0iqAme3ICC0OH7m3zUz1RF/x3xBwchkvKqLYoLrelNK', 25000, 'loick.nicolai@etu.umontpellier.fr', 0, 0),
(5255, 'Maxime', 'Bordes', 'MEA', 4, '$2a$08$Al1QpIajYXP6J5azRYJGC.0v7zKLykpse6JmdMMuizmmHr6pEia/q', 25000, 'maxime.bordes@etu.umontpellier.fr', 1, 0),
(5256, 'Chloé', 'Spahr', 'MAT', 3, '$2a$08$X1r.N7MOh2aeB7oa2Mp4zOx9MbANqoE5OXMO7ctUEPOb5OntLhdCS', 25000, 'chloe.spahr@etu.umontpellier.fr', 1, 0),
(5257, 'Theo', 'Soriano', 'MEA', 4, '$2a$08$YNIKk3cLHzWi0Dej3ZoirenAaBa7fCWaJGwGzVA4Dq2HbzRMRiDi6', 25000, 'theo.soriano@etu.umontpellier.fr', 1, 0),
(5258, 'Vivien', 'Novales', 'MEA', 3, '$2a$08$5LP58xl50g.aHFrkXhm4sugNKFWaEyCrjs0eWuBhtY6Jg/5fK.bdi', 25000, 'vivien.novales@etu.umontpellier.fr', 1, 0),
(5259, 'Quentin', 'Chanu', 'MEA', 4, '$2a$08$e9qZnNfcQiFsHMu4HW46PeyVEMkFvSbBnqus/6ddi8b65/u6CxDBe', 25000, 'quentin.chanu@etu.umontpellier.fr', 1, 0),
(5260, 'Axel ', 'Czarniak', 'MEA', 4, '$2a$08$h/tWGXFZ295/NRFXusQNQO0jswnUXL8cae0IJoDFfKNT7IVdmDt/q', 25000, 'axel.czarniak@etu.umontpellier.fr', 1, 0),
(5261, 'Dorian', 'Pasquetto', 'MEA', 4, '$2a$08$FVhfQsHFcQhzs9dhrfD5YeDJDKo7uYdf0Ug0dtHccgZpRS/F/KWs.', 25000, 'dorian.pasquetto@etu.umontpellier.fr', 1, 0),
(5262, 'JULES', 'KIRSCH', 'PEIP', 2, '$2a$08$xZ3NayJgbv7Acc7clqkFVOGJJT4Q1g3faZnC3FutneuPYHBsikfJ.', 25000, 'jules.kirsch@etu.umontpellier.fr', 1, 0),
(5263, 'Lissandre', 'Ruinat', 'PEIP', 2, '$2a$08$5hrlod4c3ZJOJYPM6ta9aOeZr.3Y7kzi2gmNcdguqZ.pi0AJo5oJS', 25000, 'lissandre.ruinat@etu.umontpellier.fr', 1, 0),
(5264, 'Florian', 'CREPIN', 'MI', 4, '$2a$08$nYq6BUVTM/k42G7L7oT4UuytqMlLzeX/YdKmantT5/XqDlVbisDty', 25000, 'florian.crepin@etu.umontpellier.fr', 1, 0),
(5265, 'Ferrara', 'Jérémy ', 'PEIP', 2, '$2a$08$fYQwyit4N/03YmeuLzB7CeRfLiPOXXxkE22SPTMQZoXMXuQ69DI3.', 25000, 'jeremy.ferrara@etu.umontpellier.fr', 1, 0),
(5266, 'Samy', 'Smail', 'PEIP', 2, '$2a$08$xy1W757VM29Vsk3TxhiDHOoabh/unl23f2Q8tdi2yWzfRTHmb3f6K', 25000, 'samy.smail@etu.umontpellier.fr', 1, 0),
(5267, 'Angelo', 'ALIBERT', 'PEIP', 1, '$2a$08$HxQ35naywPo/JF/57mk9bevjf0w9yWAXDq1ruuiIwjVulyQ9YcIjG', 25000, 'angelo.alibert@etu.umontpellier.fr', 1, 0),
(5268, 'Quentin', 'Bonnifet', 'MAT', 3, '$2a$08$baxTJGJwa9pXbEDU5eGiU.NEHrsa7b03uarJ42S9s/ddus2LCbh6m', 25000, 'quentin.bonnifet@etu.umontpellier.fr', 1, 0),
(5269, 'Bernard', 'Christaud-Braize', 'MAT', 3, '$2a$08$04LCLbYHkDDe4WvgiLs0fuFOtYJ2xzc2Ydhw4zXkcI66onHT1Yy76', 25000, 'bernard.christaud-braize@etu.umontpellier.fr', 1, 0),
(5270, 'Andy', 'Nasri', 'PEIP', 2, '$2a$08$CHPY53pnC3hjqae3O.jGe.Q125e4bkmv8QGX0xMFdQUmetDV/.m7O', 25000, 'andy.nasri@etu.umontpellier.fr', 1, 0),
(5271, 'Benoist', 'Thibault ', 'PEIP', 1, '$2a$08$MkZwPkwA.ABljs7mqR5fiuTq8Kh7AHZdoZUcCXQSqUBkysY2f6kLi', 25000, 'thibault.benoist@etu.umontpellier.fr', 1, 0),
(5272, 'Valentin', 'Cotelle', 'EGC', 3, '$2a$08$9SSJgZkFPkqmOk.vb1HRm.UKLQafj94o.uTh6MGmWUKtcQZckcZeS', 25000, 'valentin.cotelle@etu.umontpellier.fr', 1, 0),
(5273, 'Leo', 'Nowak', 'PEIP', 2, '$2a$08$fui.xrKsP3JmIBhDovXDOuXH7ds2qT930vEJh3x7ynZR1Nd/bu9JW', 25000, 'leo.nowak@etu.umontpellier.fr', 1, 0),
(5274, 'Xavier', 'Cahuzac', 'MEA', 4, '$2a$08$8aX1XIibr7.ChojWKdrnpu4DC0zikd1PMHB9jqWtL1gyDyWpoXblO', 25000, 'xavier.cahuzac@etu.umontpellier.fr', 1, 0),
(5275, 'Solene ', 'Leblond ', 'PEIP', 2, '$2a$08$7MAQqat3HcUJZzZ2MddWTOopPbG03A.SO7ERE0HLjaybqh0NysiEm', 25000, 'solene.leblond@etu.umontpellier.fr', 1, 0),
(5276, 'Assil', 'El Yahyaoui ', 'IG', 4, '$2a$08$a9WlC1m2lMhsmtlN0m2yje3ADp9GhnG4lytGXEvNG72fEtxqEYn8u', 25000, 'assil.el-yahyaoui@etu.umontpellier.fr', 1, 0),
(5277, 'Marion', 'Rlx', 'GBA', 4, '$2a$08$UULxKyNCQKk4vE2ZUFO8t.tl.6ARqWN5NtZHA8xjBmYUPsCePkAm.', 25000, 'marion.roulliaux@etu.umontpellier.fr', 1, 0),
(5278, 'Ophelie', 'Fillag', 'GBA', 5, '$2a$08$uLSvxG6RytP8aL7sWu40vu1TlfRwaQJWeOWivbbH6Miq1hKGHcF4O', 25000, 'ophelie.fillag@etu.umontpellier.fr', 1, 0),
(5279, 'Julien', 'Patouillard ', 'MAT', 4, '$2a$08$.W0f6PHiJt8VJSYUvO3u/ela0fFlHgg3L26vO96D8kn2Afbw/VSrO', 25000, 'julien.patouillard@etu.umontpellier.fr', 1, 0),
(5280, 'Sarah', 'Anthouard ', 'PEIP', 2, '$2a$08$57kBSC8ERtp27twXjf5vh.m2eO5owTPLaw8FAbt4ozxRR2drna/a6', 25000, 'sarah.anthouard@etu.umontpellier.fr', 1, 0),
(5281, 'celestin', 'moenne loccoz', 'PEIP', 2, '$2a$08$MxhEELZu7uYIa8f3YlZT2uux0tD7KbGPr.eSbCS6xLbJA2EFTbnou', 25000, 'celestin.moenne-loccoz@etu.umontpellier.fr', 1, 0),
(5282, 'ianis', 'blondet', 'PEIP', 2, '$2a$08$x50HsPzNAcHJ9jI4fKam2Oo6SQQdSrqLtpypTgPB8hSm2hnbk0m16', 25000, 'ianis.blondet@etu.umontpellier.fr', 1, 0),
(5283, 'Manon', 'Filhine', 'MAT', 4, '$2a$08$6l6pHSi0.LN89gIYW/kwJ.b3FlcNKyR736ffSwMZHNp5jr.lYRMU6', 25000, 'manon.filhine-tresarrieu@etu.umontpellier.fr', 1, 0),
(5284, 'Alexandra', 'Ciubuc', 'IG', 3, '$2a$08$Yu.0AUr6CfgC1.ysvtga3ebzu1OUTmr3BeWGSyE3cg43o2t1NcTPS', 25000, 'alexandra-cristina.ciubuc@etu.umontpellier.fr', 1, 0),
(5285, 'Paul', 'Leloup', 'MEA', 4, '$2a$08$zX/Wc5zx2XYBEIyjfKqFs.5fXxdU/xy/HysySQXSrD0JwHfN4Xbu6', 25000, 'paul.leloup@etu.umontpellier.fr', 1, 0),
(5286, 'Sacha', 'MAGNIN', 'MAT', 3, '$2a$08$dnQZp8XFVglqym8Lr.k24.T60nvZaE.30ryaOqOrrZyibHEOBySbS', 25000, 'sacha.magnin@etu.umontpellier.fr', 1, 0),
(5288, 'VIncent', 'Moral', 'MEA', 4, '$2a$08$wG6QtOtTyXdL6KGjfQQYNOQWEGo.foWLBOx6XtLZDLyGDoSLSxgnu', 25000, 'vincent.moral@etu.umontpellier.fr', 1, 0),
(5289, 'Théo', 'Coulon', 'STE', 3, '$2a$08$eKzDtIPUTC4Nx7EDTp842u6zYkTdIyLkNfggAxjbIEGAqyVctiBdW', 25000, 'theo.coulon@etu.umontpellier.fr', 0, 0),
(5290, 'Damien', 'Terebenec', 'MAT', 4, '$2a$08$175hOUBgAd4lDe4xsOT2aeQJPmACwlOOZlFZfEc3KBN00tSYTHnXi', 25000, 'damien.terebenec@etu.umontpellier.fr', 1, 0),
(5291, 'Rudy', 'Balzano', 'PEIP', 1, '$2a$08$CFSC/yKUDMjX7pO0dIekU.4KNwrYgAMuxjL9lI5zkEMhokCxhwUqq', 25000, 'rudy.balzano@etu.umontpellier.fr', 1, 0),
(5292, 'dazd', 'azdzad', 'GBA', 5, '$2a$08$LQmCi63zTTBmo.d7Uw1ZS.BygWv9hDpRnnG3RdU9aZoN2Dc9eKgw.', 25000, 'zdadaz@etu.umontpellier.fr', 0, 0),
(5294, 'Arnaud', 'Lamadon', 'MEA', 4, '$2a$08$iiINKPFUmXOVkwqgxDiC.u07quourHQKl5iI5kLsyuYsVHaPioNgO', 25000, 'arnaud.lamadon@etu.umontpellier.fr', 1, 0),
(5299, 'Marielle', 'Deman', 'STE', 4, '$2a$08$.mdAtdRl5x/a0j1eph7rZeVWHgiE4GSHVe/RXDf3P/hJROjoxiqY2', 25000, 'marielle.deman@etu.umontpellier.fr', 1, 0),
(5300, 'Hamelina', 'Ehamelo', 'IG', 4, '$2a$08$z2045i2Uhr8M9lgyPgjO..jXLBK9ipEDscu4a7LBS3sfR6xK9xuEC', 25000, 'hamelina.ehamelo@etu.umontpellier.fr', 1, 0),
(5301, 'Louka', 'Alglave', 'GBA', 5, '$2a$08$77Xo1j0M1RNd.C4BzXwdIO/A0cGGkj1QFJfQzSnXTRylI50ojuZnC', 25000, 'louka.alglave@etu.umontpellier.fr', 1, 0),
(5302, 'Cipriana', 'STEFAN', 'IG', 3, '$2a$08$EMfTj1gxVAB4lkwgWRarHuyHWzSvC1SOqE4mdDjxDqeHfy9y54H.O', 25000, 'cipriana-elan.stefan@etu.umontpellier.fr', 0, 0),
(5303, 'Adrien', 'Ducroix', 'MI', 4, '$2a$08$Dw4COWnhtdkJmLmjmxj9vu/jaTp.TAKahDMfHiOy6Et6cXGP5PMFC', 25000, 'adrien.ducroix@etu.umontpellier.fr', 1, 0),
(5304, 'simon', 'gayet', 'IG', 3, '$2a$08$lfrKMtu0rNX0usyBPICxrOUup44OSHcgq5zSURJccln7SDYnUZCHi', 25000, 'simon.gayet@etu.umontpellier.fr', 1, 0),
(5305, 'Cipriana', 'Stefan', 'IG', 3, '$2a$08$K.iUAydCtct.ijBxVX2EleKxyUSv9XeelzUtqWxTAOBXpA5Caf8l6', 25000, 'cipriana-elena.stefan@etu.umontpellier.fr', 1, 0),
(5306, 'Wilfried', 'Epiais', 'STE', 3, '$2a$08$cIY1s.i9LDmoqaFlnM0Vn.uwWi/VAHdtlmQJdfptdGsBEXRVj4gCG', 25000, 'wilfried.epiais@etu.umontpellier.fr', 1, 0),
(5307, 'Valentin', 'Vielfaure', 'MAT', 3, '$2a$08$50cuWXAlrRegbmnQngY58O54bai3v15M6h9RMhSwHQAMbfEE.S/H2', 25000, 'valentin.vielfaure@etu.umontpellier.fr', 1, 0),
(5308, 'Laurene', 'Brand', 'STE', 3, '$2a$08$nZ4BemDpUJXJbAWeSW9TTeQQWLzwRRvLnROms/cffzb.Lt.SWQm4C', 25000, 'laurene.brand@etu.umontpellier.fr', 1, 0),
(5309, 'Pierre-Louis', 'Castellon', 'PEIP', 1, '$2a$08$jj/bm7ukcK5.h9gnmiG6TOGGKOOZ11g2lrZhAYBv49OMNnxrKZ0ca', 25000, 'pierre-louis.castellon@etu.umontpellier.fr', 1, 0),
(5310, 'francois', 'sdindon', 'GBA', 5, '$2a$08$Vd0VvG/5LP3sWDbswmpxM.vTabq5jMQVH9XNkuAUfyhXBel7SduY2', 25000, 'asd@etu.umontpellier.fr', 0, 0),
(5311, 'Lucas', 'VILLA', 'PEIP', 1, '$2a$08$.Nfn..gbbPWh2e6W6pzb1egP0gVrC8AKYncmz1wlvjsNVpFuiloR2', 25000, 'lucas.villa@etu.umontpellier.fr', 1, 0),
(5312, 'Jade', 'Sanou', 'PEIP', 1, '$2a$08$IeBSRNOIvyNy6TN56xXy4.4KzBJ/Fo1hcjLBsdAtnb/aYIbYzoWCW', 25000, 'jade.sanou@etu.umontpellier.fr', 1, 0),
(5313, 'Matthieu', 'Saignemorte', 'MEA', 4, '$2a$08$DIf1VULEbOLLC2WY5AQg9urftq6dqGkV/bI3HTIRpCV6gSAYEKPei', 25000, 'matthieu.saignemorte@etu.umontpellier.fr', 1, 0),
(5314, 'Kevin', 'Hassan', 'IG', 4, '$2a$08$.RjOtEQaPMRJ9RvU1stJieab.POeo3FFQEXdBZkFWZ7mgoP610uby', 25000, 'kevin.hassan@etu.umontpellier.fr', 1, 0),
(5315, 'Samuel', 'Orru', 'MI', 5, '$2a$08$dTiWdupEmx04dX4rqi4YlupO9SuT.azSMRphen18cPeZoJouTXohu', 25000, 'samuel.orru@etu.umontpellier.fr', 0, 0),
(5316, 'Quentin', 'Cervoise', 'GBA', 5, '$2a$08$e9Hmdbi.SbOj0Nc5577ntuyLAsyqklpaiXlqLRFgMFfnun6X1CbiK', 25000, 'quentin.cervoise@etu.umontpellier.fr', 1, 0),
(5317, 'Benjamin', 'Feltin', 'PEIP', 2, '$2a$08$SzUBzSgjELJSWWijG43pYuMSTCDk90cwugKwWGaA5BTUpBSKjUM32', 25000, 'benjamin.feltin@etu.umontpellier.fr', 1, 0),
(5318, 'Lucas', 'Mas', 'IG', 3, '$2a$08$UjT1Ely60VtbRcmO6y9WTOzdBOzVTPwwQ3JnajoSUI8cPUuWvVyhu', 25000, 'lucas.mas@etu.umontpellier.fr', 1, 0),
(5319, 'Laura', 'Brl-Rx', 'PEIP', 2, '$2a$08$zwnaDv4Pz8fgBaBDkjBfzeyDZCx4NECIgCjzsihW/Uej8XOb/aQ0G', 25000, 'laura.burlon-roux@etu.umontpellier.fr', 1, 0),
(5320, 'Mehdi', 'Boughaba', 'MEA', 5, '$2a$08$X2NgXnB3E4FHFkN5Gs8ZOeKy1ePynmKi1Dl1CY7osFRN694vPocu6', 25000, 'mehdi.boughaba@etu.umontpellier.fr', 0, 0),
(5321, 'Morad', 'Bamadane', 'MEA', 3, '$2a$08$klsunEUpOydlS9bdgwWDa.vSdiymMWikDjsFhVAGhz1twMBp5rM76', 25000, 'morad.bamadane@etu.umontpellier.fr', 1, 0),
(5322, 'hugo', 'daurin', 'STE', 4, '$2a$08$AcMgZJf3FfRCFLzPZLusE.2op5efeb.8YbM41GQvzRZ1jVom7uV.m', 25000, 'hugo.daurin@etu.umontpellier.fr', 1, 0),
(5323, 'Bonjour', 'Montpellier ', 'MI', 3, '$2a$08$9cNTmGFWCZ1vyIyR5RwvKeS4C.5IZ7PdoITWCSpcCqkEvp32gmQMW', 25000, 'bonjour.montpellier@etu.umontpellier.fr', 0, 0),
(5324, 'Adrien', 'Billet', 'PEIP', 1, '$2a$08$TN9RzIjJ93U/6ZxCh9LMbeylDZ36WhAqGGCbRQ/LUqaT2loxJUPnG', 25000, 'adrien.billet@etu.umontpellier.fr', 1, 0),
(5325, 'Florent', 'Rossoni', 'STE', 4, '$2a$08$OTjyES3ZtfVgzJPyfG/HOOr/uYH.zpbYj6VooThIAgwzwR8dfG94.', 25000, 'florent.rossoni@etu.umontpellier.fr', 1, 0),
(5326, 'Jeanne', 'Martin', 'EGC', 2, '$2a$08$KEdfCEsPf13DI07srqnk7.uUXUeQQ52YQ.NTD3FJCQswHaen3dCua', 25000, 'jeanne.martin@etu.umontpellier.fr', 0, 0),
(5327, 'jerem', 'bergeron', 'MEA', 3, '$2a$08$frdlSb/R7yS302xAmK90veyuVtQp1r8RC7TYl8G2ipwdwqy04lk46', 25000, 'jeremy.bergeron@etu.umontpellier.fr', 0, 0),
(5328, 'Activite', 'Activite', 'IG', 3, '$2a$08$MR.DTtTzsEzlm86RWq1Q1OU5KSIJoU0KRqCmxqg/uFcJgURNFG2QC', 25000, 'Activite', 1, 0),
(5329, 'Amine', 'Younesy', 'PEIP', 1, '$2a$08$RsFZHLU0krtt8XaF.W9V.uWFouN2SiU8v2v8V/IulFnAyTb/Jn3cO', 25000, 'amine.younesy@etu.umontpellier.fr', 1, 0),
(5330, 'Léa ', 'NOVEL', 'GBA', 3, '$2a$08$t6hYkW6YRf12xlLrMYph.efMHcnH55mcABjVPCjsnQZm9SFOPUZQm', 25000, 'lea.novel@etu.umontpellier.fr', 1, 0),
(5331, 'lol', 'hey', 'GBA', 5, '$2a$08$HWd58Wt.5.PWUd5tYNhhrOOUSUmXem5E80e6bI2i.0K33oFqtoISO', 25000, 'hey.lo.1@etu.umontpellier.fr', 0, 0),
(18529, 'romane', 'kern', 'PEIP', 1, '$2a$08$VUQSll4aUz9EAxu5UEYe/.joJblKelfbKpTD.z2EkRoAYY32qkDsi', 25000, 'romane.kern@etu.umontpellier.fr', 1, 0),
(18530, 'Eloise', 'Codo', 'GBA', 1, '$2a$08$i/dxr57SPBUwrfTvlxCZKuDHs9DsU7ep8TId2FzJOj0xAZoH8aK/y', 25000, 'eloise.codognotto@etu.umontpellier.fr', 1, 0),
(18531, 'Marine ', 'Téroitin', 'PEIP', 1, '$2a$08$hWYRPZMd.yPaWydGc426w..C9ynwkS7SCecMXPq1VUyJ8UL59/tbu', 25000, 'marine.teroitin@etu.umontpellier.fr', 1, 0),
(18532, 'Camille', 'Joly', 'MEA', 3, '$2a$08$QZ8Jd0kOxdkjkkqTtCylYOK.wNtF9ldDw1fByOuV20aoN1Gbh.jO6', 25000, 'camille.joly01@etu.umontpellier.fr', 1, 0),
(18533, 'Ryan', 'Rakotondrazaka ', 'PEIP', 5, '$2a$08$UEd3.G8l4JU9nZI1Krg4aeMDBTPFRUqMBprr1Fx9MtYEVWt8ricwy', 25000, 'ryan.rakotondrazaka@etu.umontpellier.fr', 1, 1),
(18534, 'Mathilde', 'Tribot ', 'PEIP', 1, '$2a$08$KE1Y72JGmyqfhAnQ9NTmwuLd79Y5/WSTDf5krxqlQIsU.AsbdfeNW', 25000, 'mathilde.tribot@etu.umontpellier.fr', 1, 0),
(18535, 'Elsa', 'Veyrunes ', 'PEIP', 1, '$2a$08$c.lECRvCcucr1PMfL3Qh9OjSS9WW4lx2bu2af/o7cEldNdPhpK43u', 25000, 'elsa.veyrunes@etu.umontpellier.fr', 1, 0),
(18536, 'Raphael', 'Vigne', 'PEIP', 1, '$2a$08$tfWL6ajjncDkN2zXVJBPQ.yLOvKwl6Qvi3KjtBU8KCYgF..fSoIuG', 25000, 'raphaelvigne@etu.umontpellier.fr', 0, 0),
(18537, 'Pierre', 'Vermuse', 'PEIP', 1, '$2a$08$azvY1OQ7tiD.pn1aSABxounA7bMTwVUE57NG/tgYxOFWiSmDFySJW', 25000, 'pierre.vermuse@etu.umontpellier.fr', 1, 0),
(18538, 'Raphael', 'Vigne', 'PEIP', 1, '$2a$08$e.bhrQ07Ymv6jmbE8oHJeOCpEJaYKN83lTtcWOkSlcXAHi7oaYnC6', 25000, 'raphae.lvigne@etu.umontpellier.fr', 0, 0),
(18539, 'Marvin', 'PANSAN', 'GBA', 3, '$2a$08$gX6KCgtsGNVJ3Yg7qcySFOK2ttF5EZJz/nbUsdPzYTI/OADtD5v8q', 25000, 'marvin.pansan@etu.umontpellier.fr', 1, 0),
(18540, 'Raphael', 'Vigne', 'PEIP', 1, '$2a$08$ygPZsnJQcOkqarkqyM0a.OVdoIY/1GchDQVza34nMdx7.Zx.9DALi', 25000, 'raphael.vigne@etu.umontpellier.fr', 1, 0),
(18541, 'Corentin', 'Thourin', 'PEIP', 1, '$2a$08$gzeLX1BalKbJNnVoCcWYS.Ye4T1so/7D8RcXSfpsTGI8TAWqRrjZu', 25000, 'corentin.thourin@etu.umontpellier.fr', 1, 0),
(18542, 'Delphine', 'Duc', 'PEIP', 2, '$2a$08$f6QcTr4FMBIcFc1049t4zeLQ/89ItpFFZrU4SFFLFUNbA1NNh1Cc2', 25000, 'delphine.duc@etu.umontpellier.fr', 1, 0),
(18543, 'Amine', 'Lisri', 'PEIP', 1, '$2a$08$yeQHpbi0xlQlByQofvAVsum5tY2mvDhVKR.UgWvzRAgLbueK1cTCu', 25000, 'amine.lisri@etu.umontpellier.fr', 1, 0),
(18544, 'Mario', 'Mega', 'PEIP', 1, '$2a$08$1gRtkl2GwvGxyVAlH6aPBuJ7wo5OrDVD83kADUk1w5jsh5p7C2aL6', 25000, 'mario.mega@etu.umontpellier.fr', 1, 0),
(18545, 'Pablo', 'Lecoutre', 'PEIP', 1, '$2a$08$knBf2gzyQnkbEqHiUSyeBu.2Y5ttgnKdqVKIv9VKvSLlwDR5DtPX2', 25000, 'pablo.lecoutre@etu.umontpellier.fr', 1, 0),
(18546, 'Alex', 'Aufauvre', 'IG', 4, '$2a$08$K4lJLHgkY4MaSeLuSMwB2uP5e0k9iKK2ChGp0V5h4lkQRejzbrX5S', 25000, 'alex.aufauvre@etu.umontpellier.fr', 1, 0),
(18547, 'Lucie', 'Sanchez', 'STE', 4, '$2a$08$aOVWmr5rDvJhgM3e/uPT..lZ4jcd4y6JMnyYw4oXeRyCRJFOGEndq', 25000, 'lucie.sanchez@etu.umontpellier.fr', 1, 0),
(18548, 'Amjad', 'Menouer', 'IG', 3, '$2a$08$lnBHi0zh/SoWwV8wymOv5.sr415VW9dte44/DmeHIXYj5S/kMi1ey', 0, 'amjad.menouer@etu.umontpellier.fr', 1, 0);

-- --------------------------------------------------------

--
-- Structure de la table `UserDroit`
--

CREATE TABLE `UserDroit` (
  `idUser` int(11) NOT NULL,
  `idDroit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `UserDroit`
--

INSERT INTO `UserDroit` (`idUser`, `idDroit`) VALUES
(31, 1),
(31, 3),
(31, 7),
(29, 1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Activite`
--
ALTER TABLE `Activite`
  ADD PRIMARY KEY (`idActivite`);

--
-- Index pour la table `defis`
--
ALTER TABLE `defis`
  ADD PRIMARY KEY (`idDefi`);

--
-- Index pour la table `Droit`
--
ALTER TABLE `Droit`
  ADD UNIQUE KEY `idDroit` (`idDroit`);

--
-- Index pour la table `Membre`
--
ALTER TABLE `Membre`
  ADD PRIMARY KEY (`idMembre`);

--
-- Index pour la table `Possede`
--
ALTER TABLE `Possede`
  ADD KEY `idUser` (`idUser`),
  ADD KEY `idMembre` (`idMembre`);

--
-- Index pour la table `RecompensesActi`
--
ALTER TABLE `RecompensesActi`
  ADD PRIMARY KEY (`idRecompense`);

--
-- Index pour la table `secret`
--
ALTER TABLE `secret`
  ADD PRIMARY KEY (`idSecret`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Activite`
--
ALTER TABLE `Activite`
  MODIFY `idActivite` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `defis`
--
ALTER TABLE `defis`
  MODIFY `idDefi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT pour la table `Membre`
--
ALTER TABLE `Membre`
  MODIFY `idMembre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT pour la table `RecompensesActi`
--
ALTER TABLE `RecompensesActi`
  MODIFY `idRecompense` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;

--
-- AUTO_INCREMENT pour la table `secret`
--
ALTER TABLE `secret`
  MODIFY `idSecret` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18549;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Possede`
--
ALTER TABLE `Possede`
  ADD CONSTRAINT `cleEtrangerMembre` FOREIGN KEY (`idMembre`) REFERENCES `Membre` (`idMembre`),
  ADD CONSTRAINT `cleEtrangerUser` FOREIGN KEY (`idUser`) REFERENCES `user` (`id`);
--
-- Base de données :  `image`
--
CREATE DATABASE IF NOT EXISTS `image` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `image`;

-- --------------------------------------------------------

--
-- Structure de la table `Droits`
--

CREATE TABLE `Droits` (
  `idDroit` int(11) NOT NULL,
  `intitule` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Droits`
--

INSERT INTO `Droits` (`idDroit`, `intitule`) VALUES
(0, 'Banni'),
(1, 'Lire'),
(2, 'Ajouter'),
(3, 'Supprimer'),
(4, 'Administrer');

-- --------------------------------------------------------

--
-- Structure de la table `DroitUserSpecialite`
--

CREATE TABLE `DroitUserSpecialite` (
  `idDroit` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `idSpecialite` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `DroitUserSpecialite`
--

INSERT INTO `DroitUserSpecialite` (`idDroit`, `idUser`, `idSpecialite`) VALUES
(2, 1, 2),
(4, 2, 2);

-- --------------------------------------------------------

--
-- Structure de la table `Ecole`
--

CREATE TABLE `Ecole` (
  `idEcole` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Ecole`
--

INSERT INTO `Ecole` (`idEcole`, `nom`) VALUES
(1, 'Polytech');

-- --------------------------------------------------------

--
-- Structure de la table `File`
--

CREATE TABLE `File` (
  `idFile` varchar(150) NOT NULL,
  `type` varchar(30) NOT NULL,
  `idRessource` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `File`
--

INSERT INTO `File` (`idFile`, `type`, `idRessource`, `name`) VALUES
('upload_37e2a5588454f2c569d0e185d497e065.pdf', 'pdf', 3, 'rapportProjetWeb.pdf'),
('upload_aa8a166113e0c51f98942f52748d53eb.pdf', 'pdf', 1, 'rapportProjetWeb.pdf'),
('upload_acf322c3c2763d3be2a627106da5b911.pdf', 'pdf', 4, 'rapportTheoPonthieu.pdf');

--
-- Déclencheurs `File`
--
DELIMITER $$
CREATE TRIGGER `after_update_animal` AFTER DELETE ON `File` FOR EACH ROW INSERT INTO FileHisto (idFile, type, idRessource, name, dateHisto)
    VALUES (old.idFile, old.type, old.idRessource, old.name, NOW() )
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `FileHisto`
--

CREATE TABLE `FileHisto` (
  `idFile` varchar(150) NOT NULL,
  `type` varchar(30) NOT NULL,
  `idRessource` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dateHisto` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `FileHisto`
--

INSERT INTO `FileHisto` (`idFile`, `type`, `idRessource`, `name`, `dateHisto`) VALUES
('upload_6d70e2d0e362ae6924fe88b7945786d8.pdf', 'pdf', 1, 'rapportProjetWeb.pdf', '2018-06-03');

-- --------------------------------------------------------

--
-- Structure de la table `Matiere`
--

CREATE TABLE `Matiere` (
  `idMatiere` int(11) NOT NULL,
  `Libelle` varchar(50) NOT NULL,
  `idSpecialite` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Matiere`
--

INSERT INTO `Matiere` (`idMatiere`, `Libelle`, `idSpecialite`) VALUES
(1, 'ProjetWeb', 2);

-- --------------------------------------------------------

--
-- Structure de la table `Ressource`
--

CREATE TABLE `Ressource` (
  `idRessource` int(11) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `idTypeRessource` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Ressource`
--

INSERT INTO `Ressource` (`idRessource`, `nom`, `idTypeRessource`) VALUES
(1, 'Astuces - 1', 1),
(2, 'zef', 1),
(3, 'autre', 2),
(4, 'da', 3);

-- --------------------------------------------------------

--
-- Structure de la table `Specialite`
--

CREATE TABLE `Specialite` (
  `idSpecialite` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `idEcole` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Specialite`
--

INSERT INTO `Specialite` (`idSpecialite`, `nom`, `idEcole`) VALUES
(1, 'IG3', 1),
(2, 'IG4', 1);

-- --------------------------------------------------------

--
-- Structure de la table `TypeRessource`
--

CREATE TABLE `TypeRessource` (
  `idTypeRessource` int(11) NOT NULL,
  `name` varchar(80) NOT NULL,
  `idMatiere` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `TypeRessource`
--

INSERT INTO `TypeRessource` (`idTypeRessource`, `name`, `idMatiere`) VALUES
(1, 'Astuces', 1),
(2, 'Controle', 1),
(3, 'Rendu', 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `mdp` varchar(300) NOT NULL,
  `dateInscription` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `email`, `mdp`, `dateInscription`) VALUES
(1, 't', 't', 't', '$2a$08$PBYFqYOfFTD59JLlPvV8.ePeZNeMed0Y33HPubQ1srueKReQfTrKe', '2018-06-03'),
(2, 'tt', 'tt', 'tt', '$2a$08$ZgEtsH0BHpWgWL01SNvJnuMdwMHVydgipFkxHyLbmQADcZHQJIMsW', '2018-06-03');

--
-- Déclencheurs `user`
--
DELIMITER $$
CREATE TRIGGER `defaultDateUser` BEFORE INSERT ON `user` FOR EACH ROW set new.dateInscription = NOW()
$$
DELIMITER ;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Droits`
--
ALTER TABLE `Droits`
  ADD UNIQUE KEY `idDroit` (`idDroit`);

--
-- Index pour la table `DroitUserSpecialite`
--
ALTER TABLE `DroitUserSpecialite`
  ADD KEY `fk_user_id` (`idUser`),
  ADD KEY `conSpe_id` (`idSpecialite`);

--
-- Index pour la table `Ecole`
--
ALTER TABLE `Ecole`
  ADD PRIMARY KEY (`idEcole`);

--
-- Index pour la table `File`
--
ALTER TABLE `File`
  ADD PRIMARY KEY (`idFile`),
  ADD KEY `file_id` (`idRessource`);

--
-- Index pour la table `Matiere`
--
ALTER TABLE `Matiere`
  ADD PRIMARY KEY (`idMatiere`),
  ADD KEY `fk_spe_id` (`idSpecialite`);

--
-- Index pour la table `Ressource`
--
ALTER TABLE `Ressource`
  ADD PRIMARY KEY (`idRessource`),
  ADD KEY `ressource_id` (`idTypeRessource`);

--
-- Index pour la table `Specialite`
--
ALTER TABLE `Specialite`
  ADD PRIMARY KEY (`idSpecialite`),
  ADD KEY `ecole_id` (`idEcole`);

--
-- Index pour la table `TypeRessource`
--
ALTER TABLE `TypeRessource`
  ADD UNIQUE KEY `idTypeRessource` (`idTypeRessource`),
  ADD KEY `typeRessource_id` (`idMatiere`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Ecole`
--
ALTER TABLE `Ecole`
  MODIFY `idEcole` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Matiere`
--
ALTER TABLE `Matiere`
  MODIFY `idMatiere` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Ressource`
--
ALTER TABLE `Ressource`
  MODIFY `idRessource` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `Specialite`
--
ALTER TABLE `Specialite`
  MODIFY `idSpecialite` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `TypeRessource`
--
ALTER TABLE `TypeRessource`
  MODIFY `idTypeRessource` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `DroitUserSpecialite`
--
ALTER TABLE `DroitUserSpecialite`
  ADD CONSTRAINT `conSpe_id` FOREIGN KEY (`idSpecialite`) REFERENCES `Specialite` (`idSpecialite`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_user_id` FOREIGN KEY (`idUser`) REFERENCES `user` (`id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `File`
--
ALTER TABLE `File`
  ADD CONSTRAINT `file_id` FOREIGN KEY (`idRessource`) REFERENCES `Ressource` (`idRessource`) ON DELETE CASCADE;

--
-- Contraintes pour la table `Matiere`
--
ALTER TABLE `Matiere`
  ADD CONSTRAINT `fk_spe_id` FOREIGN KEY (`idSpecialite`) REFERENCES `Specialite` (`idSpecialite`) ON DELETE CASCADE;

--
-- Contraintes pour la table `Ressource`
--
ALTER TABLE `Ressource`
  ADD CONSTRAINT `ressource_id` FOREIGN KEY (`idTypeRessource`) REFERENCES `TypeRessource` (`idTypeRessource`) ON DELETE CASCADE;

--
-- Contraintes pour la table `Specialite`
--
ALTER TABLE `Specialite`
  ADD CONSTRAINT `ecole_id` FOREIGN KEY (`idEcole`) REFERENCES `Ecole` (`idEcole`) ON DELETE CASCADE;

--
-- Contraintes pour la table `TypeRessource`
--
ALTER TABLE `TypeRessource`
  ADD CONSTRAINT `typeRessource_id` FOREIGN KEY (`idMatiere`) REFERENCES `Matiere` (`idMatiere`) ON DELETE CASCADE;
--
-- Base de données :  `mycoloc`
--
CREATE DATABASE IF NOT EXISTS `mycoloc` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `mycoloc`;

-- --------------------------------------------------------

--
-- Structure de la table `accomplished`
--

CREATE TABLE `accomplished` (
  `idAccomplished` int(11) NOT NULL,
  `idChore` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `dateAccomplished` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `accomplished`
--

INSERT INTO `accomplished` (`idAccomplished`, `idChore`, `idUser`, `dateAccomplished`) VALUES
(1, 7, 10, 1530212921150),
(2, 6, 10, 1530212921150),
(5, 6, 15, 1530894808154),
(7, 6, 13, 1530896534163),
(10, 6, 10, 1530896568953),
(11, 9, 10, 1530954101053),
(12, 7, 13, 1531226998793),
(13, 9, 13, 1531228127459);

-- --------------------------------------------------------

--
-- Structure de la table `chore`
--

CREATE TABLE `chore` (
  `idChore` int(11) NOT NULL,
  `nameChore` varchar(100) NOT NULL,
  `idColoc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `chore`
--

INSERT INTO `chore` (`idChore`, `nameChore`, `idColoc`) VALUES
(6, 'Laver l\'évier', 1),
(7, 'Aspirateur pièces communes', 1),
(9, 'Passer la serpillère', 1);

-- --------------------------------------------------------

--
-- Structure de la table `coloc`
--

CREATE TABLE `coloc` (
  `idColoc` int(11) NOT NULL,
  `nameColoc` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `coloc`
--

INSERT INTO `coloc` (`idColoc`, `nameColoc`) VALUES
(1, 'ColocZer'),
(2, 'ColocNess'),
(15, 'Ma super coloc'),
(23, ''),
(24, ''),
(25, ''),
(26, ''),
(27, ''),
(28, ''),
(29, ''),
(30, ''),
(31, ''),
(32, ''),
(33, ''),
(34, ''),
(35, ''),
(36, ''),
(37, ''),
(38, ''),
(39, ''),
(40, ''),
(41, ''),
(42, ''),
(43, ''),
(44, 'LE SANGGG'),
(45, ''),
(46, ''),
(47, ''),
(48, ''),
(49, ''),
(50, 'LE SANGGG'),
(51, ''),
(52, ''),
(53, ''),
(54, ''),
(55, ''),
(56, ''),
(57, ''),
(58, 'L\'alcoloc');

-- --------------------------------------------------------

--
-- Structure de la table `concerned`
--

CREATE TABLE `concerned` (
  `idUser` int(11) NOT NULL,
  `idExpense` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `concerned`
--

INSERT INTO `concerned` (`idUser`, `idExpense`) VALUES
(10, 220),
(13, 220),
(15, 220),
(10, 221),
(13, 221);

-- --------------------------------------------------------

--
-- Structure de la table `expense`
--

CREATE TABLE `expense` (
  `idExpense` int(11) NOT NULL,
  `titleExpense` varchar(100) DEFAULT NULL,
  `amountExpense` double(24,8) NOT NULL,
  `dateExpense` bigint(20) DEFAULT NULL,
  `authorExpense` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `expense`
--

INSERT INTO `expense` (`idExpense`, `titleExpense`, `amountExpense`, `dateExpense`, `authorExpense`) VALUES
(220, 'Courses alimentaires', 12.00000000, 1530623918975, 10),
(221, 'PQ', 10.00000000, 1530624045751, 13);

-- --------------------------------------------------------

--
-- Structure de la table `invitation`
--

CREATE TABLE `invitation` (
  `idUserInviter` int(11) NOT NULL,
  `idColoc` int(11) NOT NULL,
  `idUserInvited` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `invitation`
--

INSERT INTO `invitation` (`idUserInviter`, `idColoc`, `idUserInvited`) VALUES
(10, 1, 13),
(10, 1, 13),
(10, 1, 13),
(10, 1, 13),
(10, 1, 13);

-- --------------------------------------------------------

--
-- Structure de la table `photos`
--

CREATE TABLE `photos` (
  `idPhoto` varchar(50) NOT NULL,
  `idColoc` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `format` varchar(50) NOT NULL,
  `ressourceType` varchar(10) NOT NULL,
  `secureUrl` varchar(150) NOT NULL,
  `originalFileName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `photos`
--

INSERT INTO `photos` (`idPhoto`, `idColoc`, `idUser`, `format`, `ressourceType`, `secureUrl`, `originalFileName`) VALUES
('wbnanudv4yalpdm7qmqr', 58, 18, 'png', 'image', 'https://res.cloudinary.com/mycoloc/image/upload/v1533589281/wbnanudv4yalpdm7qmqr.png', 'upload_9700dab74a806292747c783568c51261'),
('anlrw8kdgnfhbwqh4bjw', 58, 18, 'jpg', 'image', 'https://res.cloudinary.com/mycoloc/image/upload/v1533589319/anlrw8kdgnfhbwqh4bjw.jpg', 'upload_af7c382766d23073ab4c2ef587084f4e'),
('ockg56gbookfht0ve4gl', 58, 18, 'png', 'image', 'https://res.cloudinary.com/mycoloc/image/upload/v1533590253/ockg56gbookfht0ve4gl.png', 'upload_f9149aa5c4145e2694917ac781f4a828'),
('ai4n3xuopsdg1e5xkv0f', 58, 18, 'png', 'image', 'https://res.cloudinary.com/mycoloc/image/upload/v1533903676/ai4n3xuopsdg1e5xkv0f.png', 'upload_d02f2690848056289db2a533788bc013');

-- --------------------------------------------------------

--
-- Structure de la table `task`
--

CREATE TABLE `task` (
  `idTask` int(11) NOT NULL,
  `nameTask` varchar(100) NOT NULL,
  `isArchivedTask` tinyint(1) NOT NULL DEFAULT '0',
  `authorTask` int(11) NOT NULL,
  `dateTask` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `task`
--

INSERT INTO `task` (`idTask`, `nameTask`, `isArchivedTask`, `authorTask`, `dateTask`) VALUES
(63, 'poubelle', 0, 17, 1528008265722),
(75, 'Laver le lavabo', 1, 10, 1530739267160),
(76, 'Acheter du pain', 0, 13, -1),
(77, 'Ranger le placard à chaussures', 0, 13, -1),
(78, 'zef', 0, 18, -1),
(79, 'Rien a faire', 0, 18, -1),
(80, 'passer le balet', 0, 18, -1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL,
  `firstnameUser` varchar(32) NOT NULL,
  `lastnameUser` varchar(32) NOT NULL,
  `nicknameUser` varchar(20) DEFAULT NULL,
  `emailUser` varchar(250) NOT NULL,
  `idColoc` int(11) DEFAULT NULL,
  `passwordUser` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`idUser`, `firstnameUser`, `lastnameUser`, `nicknameUser`, `emailUser`, `idColoc`, `passwordUser`) VALUES
(10, 'Quentin', 'France', 'zork', 'quentin.france@free.fr', 1, '$2b$08$SKUavwj/36jQww4U4T.rWu/8BC.Si9gLlKjgj/8vzbv4tdjZBL17m'),
(13, 'Theo', 'Ponthieu', 'TheoPth', 't@p.fr', 1, '$2b$08$VkCYSEOQuB61A4KpuRZ2beZfIqHoyNKALGciNHI8ghU1u52hO6pT6'),
(14, 'Thomas', 'Rémy', NULL, 'thom.remy@gmail.com', NULL, '$2b$08$nZHoTbocoh1DFi.N/obB4OrfTIfL2q2lQiQqhdqAiu/q90PkO5P.m'),
(15, 'Lola', 'Pirat', NULL, 'lola.pirat@gmail.com', 1, '$2b$08$JKVgzGmp0P19x1kWzeO/Y.qlEZdipxFYMI4C3aDu7pHaxy5zFkCAi'),
(16, 'Frédéric', 'France', NULL, 'frederic.france@free.fr', 43, '$2b$08$QanmMRnJsr4TriMlquxoyes.QqBwPIamMXm/LSxHw7bkzfjMyHMum'),
(17, 'Lola', 'PIRAT', NULL, 'lolapiratdichon34830@gmail.com', 50, '$2b$08$vVgYG7d4f3lTkH1xR4cRcO8M0UCB128VJosgYvIfvStrAR7yxgnMW'),
(18, 'Théo', 'Ponthieu', NULL, 'theo@p.fr', 58, '$2a$08$UYttFqMJAxlEd2RFOmNTN.pUOwgOLHaIe0MHZbCK6TUqyW4kmwNdO'),
(19, 'Théo2', 'Ponthieu2', NULL, 'theo.ponthieu@hotmail.fr', 58, '$2a$08$NrLIIJJpz4poimixxX5VruEkoH9l.0O780Hil6HLrNyYlVBiFXeVe');

--
-- Déclencheurs `user`
--
DELIMITER $$
CREATE TRIGGER `after_update_user` AFTER UPDATE ON `user` FOR EACH ROW BEGIN
IF NEW.idColoc != OLD.idColoc THEN
	DELETE FROM expense
    WHERE authorExpense = OLD.idUser;
END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_update_user_tasks` AFTER UPDATE ON `user` FOR EACH ROW BEGIN
IF NEW.idColoc != OLD.idColoc THEN
	DELETE FROM task
    WHERE authorTask = OLD.idUser;
END IF;
END
$$
DELIMITER ;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `accomplished`
--
ALTER TABLE `accomplished`
  ADD PRIMARY KEY (`idAccomplished`),
  ADD KEY `idChore` (`idChore`),
  ADD KEY `idUser` (`idUser`);

--
-- Index pour la table `chore`
--
ALTER TABLE `chore`
  ADD PRIMARY KEY (`idChore`),
  ADD KEY `idColoc` (`idColoc`);

--
-- Index pour la table `coloc`
--
ALTER TABLE `coloc`
  ADD PRIMARY KEY (`idColoc`);

--
-- Index pour la table `concerned`
--
ALTER TABLE `concerned`
  ADD KEY `idUser` (`idUser`),
  ADD KEY `idExpense` (`idExpense`);

--
-- Index pour la table `expense`
--
ALTER TABLE `expense`
  ADD PRIMARY KEY (`idExpense`);

--
-- Index pour la table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`idTask`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`),
  ADD KEY `idColoc` (`idColoc`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `accomplished`
--
ALTER TABLE `accomplished`
  MODIFY `idAccomplished` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT pour la table `chore`
--
ALTER TABLE `chore`
  MODIFY `idChore` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT pour la table `coloc`
--
ALTER TABLE `coloc`
  MODIFY `idColoc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT pour la table `expense`
--
ALTER TABLE `expense`
  MODIFY `idExpense` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=222;

--
-- AUTO_INCREMENT pour la table `task`
--
ALTER TABLE `task`
  MODIFY `idTask` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `accomplished`
--
ALTER TABLE `accomplished`
  ADD CONSTRAINT `idChoreAccomplishedConstraint` FOREIGN KEY (`idChore`) REFERENCES `chore` (`idChore`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `idUserAccomplishedConstraint` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `chore`
--
ALTER TABLE `chore`
  ADD CONSTRAINT `idColocChoreConstraint` FOREIGN KEY (`idColoc`) REFERENCES `coloc` (`idColoc`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `concerned`
--
ALTER TABLE `concerned`
  ADD CONSTRAINT `idExpenseConcernedConstraint` FOREIGN KEY (`idExpense`) REFERENCES `expense` (`idExpense`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `idUserConcernedConstraint` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `idColocConstraint` FOREIGN KEY (`idColoc`) REFERENCES `coloc` (`idColoc`) ON DELETE CASCADE ON UPDATE CASCADE;
--
-- Base de données :  `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `phpmyadmin`;

-- --------------------------------------------------------

--
-- Structure de la table `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(11) NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Structure de la table `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Structure de la table `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Structure de la table `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

-- --------------------------------------------------------

--
-- Structure de la table `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

--
-- Déchargement des données de la table `pma__export_templates`
--

INSERT INTO `pma__export_templates` (`id`, `username`, `export_type`, `template_name`, `template_data`) VALUES
(1, 'root', 'database', 'polysharebaseV1.0', '{\"quick_or_custom\":\"quick\",\"what\":\"sql\",\"structure_or_data_forced\":\"0\",\"table_select[]\":[\"Answer\",\"Approve\",\"Class\",\"Liked\",\"MediaFiles\",\"Participate\",\"Question\",\"Rank\",\"Recommand\",\"RevisionSession\",\"SingleSession\",\"Skill\",\"Student\",\"Study\",\"Subject\",\"Topic\"],\"table_structure[]\":[\"Answer\",\"Approve\",\"Class\",\"Liked\",\"MediaFiles\",\"Participate\",\"Question\",\"Rank\",\"Recommand\",\"RevisionSession\",\"SingleSession\",\"Skill\",\"Student\",\"Study\",\"Subject\",\"Topic\"],\"table_data[]\":[\"Answer\",\"Approve\",\"Class\",\"Liked\",\"MediaFiles\",\"Participate\",\"Question\",\"Rank\",\"Recommand\",\"RevisionSession\",\"SingleSession\",\"Skill\",\"Student\",\"Study\",\"Subject\",\"Topic\"],\"aliases_new\":\"\",\"output_format\":\"sendit\",\"filename_template\":\"@DATABASE@\",\"remember_template\":\"on\",\"charset\":\"utf-8\",\"compression\":\"none\",\"maxsize\":\"\",\"codegen_structure_or_data\":\"data\",\"codegen_format\":\"0\",\"csv_separator\":\",\",\"csv_enclosed\":\"\\\"\",\"csv_escaped\":\"\\\"\",\"csv_terminated\":\"AUTO\",\"csv_null\":\"NULL\",\"csv_structure_or_data\":\"data\",\"excel_null\":\"NULL\",\"excel_columns\":\"something\",\"excel_edition\":\"win\",\"excel_structure_or_data\":\"data\",\"json_structure_or_data\":\"data\",\"json_unicode\":\"something\",\"latex_caption\":\"something\",\"latex_structure_or_data\":\"structure_and_data\",\"latex_structure_caption\":\"Structure de la table @TABLE@\",\"latex_structure_continued_caption\":\"Structure de la table @TABLE@ (suite)\",\"latex_structure_label\":\"tab:@TABLE@-structure\",\"latex_relation\":\"something\",\"latex_comments\":\"something\",\"latex_mime\":\"something\",\"latex_columns\":\"something\",\"latex_data_caption\":\"Contenu de la table @TABLE@\",\"latex_data_continued_caption\":\"Contenu de la table @TABLE@ (suite)\",\"latex_data_label\":\"tab:@TABLE@-data\",\"latex_null\":\"\\\\textit{NULL}\",\"mediawiki_structure_or_data\":\"structure_and_data\",\"mediawiki_caption\":\"something\",\"mediawiki_headers\":\"something\",\"htmlword_structure_or_data\":\"structure_and_data\",\"htmlword_null\":\"NULL\",\"ods_null\":\"NULL\",\"ods_structure_or_data\":\"data\",\"odt_structure_or_data\":\"structure_and_data\",\"odt_relation\":\"something\",\"odt_comments\":\"something\",\"odt_mime\":\"something\",\"odt_columns\":\"something\",\"odt_null\":\"NULL\",\"pdf_report_title\":\"\",\"pdf_structure_or_data\":\"structure_and_data\",\"phparray_structure_or_data\":\"data\",\"sql_include_comments\":\"something\",\"sql_header_comment\":\"\",\"sql_use_transaction\":\"something\",\"sql_compatibility\":\"NONE\",\"sql_structure_or_data\":\"structure_and_data\",\"sql_create_table\":\"something\",\"sql_auto_increment\":\"something\",\"sql_create_view\":\"something\",\"sql_procedure_function\":\"something\",\"sql_create_trigger\":\"something\",\"sql_backquotes\":\"something\",\"sql_type\":\"INSERT\",\"sql_insert_syntax\":\"both\",\"sql_max_query_size\":\"50000\",\"sql_hex_for_binary\":\"something\",\"sql_utc_time\":\"something\",\"texytext_structure_or_data\":\"structure_and_data\",\"texytext_null\":\"NULL\",\"xml_structure_or_data\":\"data\",\"xml_export_events\":\"something\",\"xml_export_functions\":\"something\",\"xml_export_procedures\":\"something\",\"xml_export_tables\":\"something\",\"xml_export_triggers\":\"something\",\"xml_export_views\":\"something\",\"xml_export_contents\":\"something\",\"yaml_structure_or_data\":\"data\",\"\":null,\"lock_tables\":null,\"as_separate_files\":null,\"csv_removeCRLF\":null,\"csv_columns\":null,\"excel_removeCRLF\":null,\"json_pretty_print\":null,\"htmlword_columns\":null,\"ods_columns\":null,\"sql_dates\":null,\"sql_relation\":null,\"sql_mime\":null,\"sql_disable_fk\":null,\"sql_views_as_tables\":null,\"sql_metadata\":null,\"sql_create_database\":null,\"sql_drop_table\":null,\"sql_if_not_exists\":null,\"sql_truncate\":null,\"sql_delayed\":null,\"sql_ignore\":null,\"texytext_columns\":null}');

-- --------------------------------------------------------

--
-- Structure de la table `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Structure de la table `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Structure de la table `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

-- --------------------------------------------------------

--
-- Structure de la table `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Structure de la table `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Déchargement des données de la table `pma__recent`
--

INSERT INTO `pma__recent` (`username`, `tables`) VALUES
('root', '[{\"db\":\"polysharebase\",\"table\":\"MediaFiles\"},{\"db\":\"polysharebase\",\"table\":\"Class\"},{\"db\":\"polysharebase\",\"table\":\"Study\"},{\"db\":\"polysharebase\",\"table\":\"SingleSession\"},{\"db\":\"polysharebase\",\"table\":\"Student\"},{\"db\":\"polysharebase\",\"table\":\"Subject\"},{\"db\":\"polysharebase\",\"table\":\"Skill\"},{\"db\":\"polysharebase\",\"table\":\"Question\"},{\"db\":\"polysharebase\",\"table\":\"Rank\"},{\"db\":\"polysharebase\",\"table\":\"Approve\"}]');

-- --------------------------------------------------------

--
-- Structure de la table `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

--
-- Déchargement des données de la table `pma__relation`
--

INSERT INTO `pma__relation` (`master_db`, `master_table`, `master_field`, `foreign_db`, `foreign_table`, `foreign_field`) VALUES
('dolcevitechdb', 'Possede', 'idUser', 'dolcevitechdb', 'user', 'id'),
('dolcevitechdb', 'ProposeSecret', 'idMembre', 'dolcevitechdb', 'Membre', 'idMembre'),
('dolcevitechdb', 'ProposeSecret', 'idSecret', 'dolcevitechdb', 'secret', 'idSecret'),
('dolcevitechdb', 'ProposeSecret', 'idUser', 'dolcevitechdb', 'user', 'id'),
('dolcevitechdb', 'Realise', 'idUser', 'dolcevitechdb', 'user', 'id'),
('dolcevitechdb', 'RealiseActivite', 'idActivite', 'dolcevitechdb', 'Activite', 'idActivite'),
('dolcevitechdb', 'RealiseActivite', 'idUser', 'dolcevitechdb', 'user', 'id'),
('dolcevitechdb', 'RealiserDefi', 'idDefi', 'dolcevitechdb', 'defis', 'idDefi'),
('dolcevitechdb', 'RealiserDefi', 'idMembre', 'dolcevitechdb', 'Membre', 'idMembre'),
('dolcevitechdb', 'RealiserDefi', 'idUser', 'dolcevitechdb', 'user', 'id'),
('dolcevitechdb', 'UserDroit', 'idDroit', 'dolcevitechdb', 'Droit', 'idDroit'),
('dolcevitechdb', 'UserDroit', 'idUser', 'dolcevitechdb', 'user', 'id'),
('dolcevitechdb', 'secret', 'idMembre', 'dolcevitechdb', 'Membre', 'idMembre'),
('image', 'DroitUserMatiere', 'idDroit', 'image', 'Droits', 'idDroit'),
('image', 'DroitUserMatiere', 'idMatiere', 'image', 'Matiere', 'idMatiere'),
('image', 'DroitUserMatiere', 'idUser', 'image', 'user', 'id'),
('image', 'File', 'idRessource', 'image', 'Ressource', 'idRessource'),
('image', 'Matiere', 'idSpecialite', 'image', 'Specialite', 'idSpecialite'),
('image', 'Ressource', 'idTypeRessource', 'image', 'TypeRessource', 'idTypeRessource'),
('image', 'TypeRessource', 'idMatiere', 'image', 'Matiere', 'idMatiere'),
('mycoloc', 'photos', 'idColoc', 'mycoloc', 'coloc', 'idColoc'),
('mycoloc', 'photos', 'idUser', 'mycoloc', 'user', 'idUser'),
('polysharebase', 'Answer', 'idQuestion', 'polysharebase', 'Question', 'idQuestion'),
('polysharebase', 'Approve', 'idAnswer', 'polysharebase', 'Answer', 'idAnswer'),
('polysharebase', 'Approve', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Liked', 'idMediaFiles', 'polysharebase', 'MediaFiles', 'idMediaFiles'),
('polysharebase', 'Liked', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Manage', 'idClass', 'polysharebase', 'Class', 'idClass'),
('polysharebase', 'Manage', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'MediaFiles', 'idTopic', 'polysharebase', 'Topic', 'idTopic'),
('polysharebase', 'Participate', 'idRevisionSession', 'polysharebase', 'RevisionSession', 'idRevisionSession'),
('polysharebase', 'Participate', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Question', 'idTopic', 'polysharebase', 'Topic', 'idTopic'),
('polysharebase', 'Rank', 'idQuestion', 'polysharebase', 'Question', 'idQuestion'),
('polysharebase', 'Rank', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Recommand', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Recommand', 'idStudentRecommended', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'RevisionSession', 'idClass', 'polysharebase', 'Class', 'idClass'),
('polysharebase', 'RevisionSession', 'idSubject', 'polysharebase', 'Subject', 'idSubject'),
('polysharebase', 'RevisionSession', 'idTeacher', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'SingleRevision', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'SingleRevision', 'idSubject', 'polysharebase', 'Subject', 'idSubject'),
('polysharebase', 'SingleRevision', 'idTeacher', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'SingleSession', 'idClass', 'polysharebase', 'Class', 'idClass'),
('polysharebase', 'SingleSession', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'SingleSession', 'idSubject', 'polysharebase', 'Subject', 'idSubject'),
('polysharebase', 'SingleSession', 'idTeacher', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Skill', 'idClass', 'polysharebase', 'Class', 'idClass'),
('polysharebase', 'Skill', 'idSkill', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Study', 'idClass', 'polysharebase', 'Class', 'idClass'),
('polysharebase', 'Study', 'idStudent', 'polysharebase', 'Student', 'idStudent'),
('polysharebase', 'Subject', 'idClass', 'polysharebase', 'Class', 'idClass'),
('polysharebase', 'Topic', 'idSubject', 'polysharebase', 'Subject', 'idSubject');

-- --------------------------------------------------------

--
-- Structure de la table `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Structure de la table `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT '0',
  `x` float UNSIGNED NOT NULL DEFAULT '0',
  `y` float UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Structure de la table `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

--
-- Déchargement des données de la table `pma__table_info`
--

INSERT INTO `pma__table_info` (`db_name`, `table_name`, `display_field`) VALUES
('image', 'Specialite', 'idEcole'),
('polysharebase', 'Answer', 'contentAnswer'),
('polysharebase', 'MediaFiles', 'nameMediaFile'),
('polysharebase', 'Question', 'contentQuestion'),
('polysharebase', 'Skill', 'nomSkill'),
('polysharebase', 'Study', 'nameStatus'),
('polysharebase', 'Subject', 'nameSubject'),
('polysharebase', 'Topic', 'nameTopic');

-- --------------------------------------------------------

--
-- Structure de la table `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

--
-- Déchargement des données de la table `pma__table_uiprefs`
--

INSERT INTO `pma__table_uiprefs` (`username`, `db_name`, `table_name`, `prefs`, `last_update`) VALUES
('root', 'dolcevitechdb', 'Activite', '{\"sorted_col\":\"`idActivite` ASC\"}', '2018-04-10 14:52:10'),
('root', 'dolcevitechdb', 'Membre', '{\"sorted_col\":\"`prenom` ASC\"}', '2018-04-11 08:37:39'),
('root', 'dolcevitechdb', 'Realise', '{\"sorted_col\":\"`Realise`.`meilleurScore`  DESC\"}', '2018-03-20 20:59:01'),
('root', 'dolcevitechdb', 'RealiseActivite', '{\"CREATE_TIME\":\"2018-04-08 12:20:26\",\"col_order\":[\"0\",\"1\",\"2\",\"3\"],\"col_visib\":[\"1\",\"1\",\"1\",\"1\"]}', '2018-04-10 15:29:24'),
('root', 'mycoloc', 'photos', '{\"sorted_col\":\"`photos`.`secureUrl` ASC\"}', '2018-08-01 13:42:32');

-- --------------------------------------------------------

--
-- Structure de la table `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin,
  `data_sql` longtext COLLATE utf8_bin,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Structure de la table `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Déchargement des données de la table `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2019-01-20 18:12:10', '{\"lang\":\"fr\",\"collation_connection\":\"utf8mb4_unicode_ci\",\"SendErrorReports\":\"always\",\"Console\\/Mode\":\"collapse\"}');

-- --------------------------------------------------------

--
-- Structure de la table `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Structure de la table `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Index pour la table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Index pour la table `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Index pour la table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Index pour la table `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Index pour la table `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Index pour la table `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Index pour la table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Index pour la table `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Index pour la table `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Index pour la table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Index pour la table `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Index pour la table `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Index pour la table `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Index pour la table `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Index pour la table `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Index pour la table `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Index pour la table `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Base de données :  `polysharebase`
--
CREATE DATABASE IF NOT EXISTS `polysharebase` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `polysharebase`;

-- --------------------------------------------------------

--
-- Structure de la table `Answer`
--

CREATE TABLE `Answer` (
  `idAnswer` int(11) NOT NULL,
  `contentAnswer` text NOT NULL,
  `idQuestion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Answer`
--

INSERT INTO `Answer` (`idAnswer`, `contentAnswer`, `idQuestion`) VALUES
(1, 'C\'est moi ! JE suis toujours en train de répondre au qustions vraiment c\'est une grande passion j\'adore ça quoi', 1),
(2, 'C\'est tt.', 1),
(3, 'OUIO', 1),
(6, 'zefz', 1),
(7, 'Salut je suis la nouvelle question', 1),
(8, 'Bnjours moi aussi', 1),
(9, '3', 2),
(10, 'fzefzef', 2),
(11, 'oui', 3),
(12, 'yes', 6),
(13, 'Je ne sais pas...', 7),
(14, 'Le Pattern DAO est très important !', 7);

-- --------------------------------------------------------

--
-- Structure de la table `Approve`
--

CREATE TABLE `Approve` (
  `idAnswer` int(11) NOT NULL,
  `idStudent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Approve`
--

INSERT INTO `Approve` (`idAnswer`, `idStudent`) VALUES
(4, 0),
(5, 0),
(6, 0),
(10, 0),
(11, 0),
(12, 0),
(14, 0);

-- --------------------------------------------------------

--
-- Structure de la table `Class`
--

CREATE TABLE `Class` (
  `idClass` int(11) NOT NULL,
  `nameClass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Class`
--

INSERT INTO `Class` (`idClass`, `nameClass`) VALUES
(1, 'classtats'),
(5, 'Ma nouvelle class'),
(6, 'ig3'),
(7, 'ig4');

-- --------------------------------------------------------

--
-- Structure de la table `Liked`
--

CREATE TABLE `Liked` (
  `idStudent` int(11) NOT NULL,
  `idMediaFiles` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `MediaFiles`
--

CREATE TABLE `MediaFiles` (
  `idMediaFiles` int(11) NOT NULL,
  `nameMediaFile` varchar(30) NOT NULL,
  `idTopic` int(11) NOT NULL,
  `lien` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Participate`
--

CREATE TABLE `Participate` (
  `idRevisionSession` int(11) NOT NULL,
  `idStudent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Question`
--

CREATE TABLE `Question` (
  `idQuestion` int(11) NOT NULL,
  `contentQuestion` text NOT NULL,
  `idTopic` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Question`
--

INSERT INTO `Question` (`idQuestion`, `contentQuestion`, `idTopic`) VALUES
(1, 'Qui est le meilleur ?', 0),
(2, 'deux ?', 0),
(3, 'Y a qqn ?', 0),
(4, 'J ai pas bien compris comment les quote ca amrche', 0),
(5, 'qui c est ?', 0),
(6, 'test ?', 0),
(7, 'Quels sont les designs partern les plus importants ?', 10);

-- --------------------------------------------------------

--
-- Structure de la table `Rank`
--

CREATE TABLE `Rank` (
  `idStudent` int(11) NOT NULL,
  `idQuestion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Rank`
--

INSERT INTO `Rank` (`idStudent`, `idQuestion`) VALUES
(0, 1),
(0, 2),
(0, 3),
(0, 5),
(0, 6),
(0, 7),
(1, 0),
(2, 0);

-- --------------------------------------------------------

--
-- Structure de la table `Recommand`
--

CREATE TABLE `Recommand` (
  `idStudent` int(11) NOT NULL,
  `idStudentRecommended` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `RevisionSession`
--

CREATE TABLE `RevisionSession` (
  `idRevisionSession` int(11) NOT NULL,
  `idClass` int(11) NOT NULL,
  `dateAppointement` date NOT NULL,
  `idSubject` int(11) NOT NULL,
  `idTeacher` int(11) NOT NULL,
  `place` varchar(30) NOT NULL,
  `meetingTime` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `SingleSession`
--

CREATE TABLE `SingleSession` (
  `idSingleRevision` int(11) NOT NULL,
  `idClass` int(11) NOT NULL,
  `dateAppointement` date NOT NULL,
  `idSubject` int(11) NOT NULL,
  `idStudent` int(11) NOT NULL,
  `idTeacher` int(11) NOT NULL,
  `place` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `SingleSession`
--

INSERT INTO `SingleSession` (`idSingleRevision`, `idClass`, `dateAppointement`, `idSubject`, `idStudent`, `idTeacher`, `place`) VALUES
(1, 6, '2019-01-18', 1, 2, 2, 'MONTPELLIER');

-- --------------------------------------------------------

--
-- Structure de la table `Skill`
--

CREATE TABLE `Skill` (
  `idSkill` int(11) NOT NULL,
  `nomSkill` varchar(50) NOT NULL,
  `markSkill` varchar(50) NOT NULL,
  `idStudent` int(11) NOT NULL,
  `idClass` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Skill`
--

INSERT INTO `Skill` (`idSkill`, `nomSkill`, `markSkill`, `idStudent`, `idClass`) VALUES
(2, 'erg', '1', 1, 7);

-- --------------------------------------------------------

--
-- Structure de la table `Student`
--

CREATE TABLE `Student` (
  `idStudent` int(11) NOT NULL,
  `nameStudent` varchar(50) NOT NULL,
  `firstNameStudent` varchar(50) NOT NULL,
  `emailStudent` varchar(50) NOT NULL,
  `password` varchar(200) NOT NULL,
  `loginID` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Student`
--

INSERT INTO `Student` (`idStudent`, `nameStudent`, `firstNameStudent`, `emailStudent`, `password`, `loginID`) VALUES
(1, 'Ponthieu', 'Théo', 'theo.ponthieu@hotmail.fr', 't', 'TheoPth'),
(2, 'ponthieu', 'theo', 't', 't', 't'),
(3, 'Ponthieu', 'theo', 't@hot.fr', 't', 'theoPth'),
(4, 'po', 'th', 'poj', 'poj', 'poj');

-- --------------------------------------------------------

--
-- Structure de la table `Study`
--

CREATE TABLE `Study` (
  `idStudent` int(11) NOT NULL,
  `idClass` int(11) NOT NULL,
  `nameStatus` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Study`
--

INSERT INTO `Study` (`idStudent`, `idClass`, `nameStatus`) VALUES
(2, 6, 'study');

-- --------------------------------------------------------

--
-- Structure de la table `Subject`
--

CREATE TABLE `Subject` (
  `idSubject` int(11) NOT NULL,
  `nameSubject` varchar(30) NOT NULL,
  `idClass` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Subject`
--

INSERT INTO `Subject` (`idSubject`, `nameSubject`, `idClass`) VALUES
(1, 'OOSE', 7),
(8, 'gggg', 1),
(9, 'oose', 1),
(10, 'Java', 6);

-- --------------------------------------------------------

--
-- Structure de la table `Topic`
--

CREATE TABLE `Topic` (
  `idTopic` int(11) NOT NULL,
  `idSubject` int(11) NOT NULL,
  `nameTopic` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Topic`
--

INSERT INTO `Topic` (`idTopic`, `idSubject`, `nameTopic`) VALUES
(0, 1, 'tpOOSE'),
(1, 2, 'fgtfef'),
(2, 2, 'te'),
(3, 3, 'gtgt'),
(4, 4, 'srg'),
(5, 5, 'rf'),
(6, 6, 'gggg'),
(7, 7, 'ggg'),
(8, 8, 'grrgrg'),
(9, 9, 'fxml'),
(10, 10, 'Design patterns');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Answer`
--
ALTER TABLE `Answer`
  ADD PRIMARY KEY (`idAnswer`);

--
-- Index pour la table `Approve`
--
ALTER TABLE `Approve`
  ADD PRIMARY KEY (`idAnswer`,`idStudent`);

--
-- Index pour la table `Class`
--
ALTER TABLE `Class`
  ADD PRIMARY KEY (`idClass`);

--
-- Index pour la table `Liked`
--
ALTER TABLE `Liked`
  ADD PRIMARY KEY (`idStudent`,`idMediaFiles`);

--
-- Index pour la table `MediaFiles`
--
ALTER TABLE `MediaFiles`
  ADD PRIMARY KEY (`idMediaFiles`);

--
-- Index pour la table `Participate`
--
ALTER TABLE `Participate`
  ADD PRIMARY KEY (`idRevisionSession`,`idStudent`);

--
-- Index pour la table `Question`
--
ALTER TABLE `Question`
  ADD PRIMARY KEY (`idQuestion`);

--
-- Index pour la table `Rank`
--
ALTER TABLE `Rank`
  ADD PRIMARY KEY (`idStudent`,`idQuestion`);

--
-- Index pour la table `RevisionSession`
--
ALTER TABLE `RevisionSession`
  ADD PRIMARY KEY (`idRevisionSession`);

--
-- Index pour la table `SingleSession`
--
ALTER TABLE `SingleSession`
  ADD PRIMARY KEY (`idSingleRevision`);

--
-- Index pour la table `Skill`
--
ALTER TABLE `Skill`
  ADD PRIMARY KEY (`idSkill`);

--
-- Index pour la table `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`idStudent`);

--
-- Index pour la table `Subject`
--
ALTER TABLE `Subject`
  ADD PRIMARY KEY (`idSubject`);

--
-- Index pour la table `Topic`
--
ALTER TABLE `Topic`
  ADD PRIMARY KEY (`idTopic`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Answer`
--
ALTER TABLE `Answer`
  MODIFY `idAnswer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `Class`
--
ALTER TABLE `Class`
  MODIFY `idClass` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `Liked`
--
ALTER TABLE `Liked`
  MODIFY `idStudent` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `MediaFiles`
--
ALTER TABLE `MediaFiles`
  MODIFY `idMediaFiles` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Participate`
--
ALTER TABLE `Participate`
  MODIFY `idRevisionSession` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Question`
--
ALTER TABLE `Question`
  MODIFY `idQuestion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `SingleSession`
--
ALTER TABLE `SingleSession`
  MODIFY `idSingleRevision` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Skill`
--
ALTER TABLE `Skill`
  MODIFY `idSkill` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `Student`
--
ALTER TABLE `Student`
  MODIFY `idStudent` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `Subject`
--
ALTER TABLE `Subject`
  MODIFY `idSubject` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Base de données :  `revisionControle`
--
CREATE DATABASE IF NOT EXISTS `revisionControle` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `revisionControle`;

-- --------------------------------------------------------

--
-- Structure de la table `Film`
--

CREATE TABLE `Film` (
  `TitreFilm` varchar(20) NOT NULL,
  `AnneeFilm` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Film`
--

INSERT INTO `Film` (`TitreFilm`, `AnneeFilm`) VALUES
('Lendemain', '2018-05-01'),
('Avant', '2018-04-02'),
('Apres', '2018-05-31'),
('pas celui mla', '2018-05-26'),
('Nonon', '2018-05-11');
--
-- Base de données :  `revisions`
--
CREATE DATABASE IF NOT EXISTS `revisions` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `revisions`;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `numero` int(11) NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`numero`, `age`) VALUES
(1, 12),
(2, 13),
(3, 5),
(4, 5),
(5, 13);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`numero`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `numero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Base de données :  `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
--
-- Base de données :  `testSql`
--
CREATE DATABASE IF NOT EXISTS `testSql` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `testSql`;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
