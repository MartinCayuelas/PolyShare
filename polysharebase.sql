-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  sam. 12 jan. 2019 à 03:48
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
-- Base de données :  `polysharebase`
--

-- --------------------------------------------------------

--
-- Structure de la table `Answer`
--

CREATE TABLE `Answer` (
  `idAnswer` int(11) NOT NULL,
  `contentAnswer` text NOT NULL,
  `dateAnswer` date NOT NULL,
  `idQuestion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Approve`
--

CREATE TABLE `Approve` (
  `idAnswer` int(11) NOT NULL,
  `idStudent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Class`
--

CREATE TABLE `Class` (
  `idClass` int(11) NOT NULL,
  `nameClass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
-- Structure de la table `Manage`
--

CREATE TABLE `Manage` (
  `idStudent` int(11) NOT NULL,
  `idClass` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `MediaFiles`
--

CREATE TABLE `MediaFiles` (
  `idMediaFiles` int(11) NOT NULL,
  `nameMediaFile` varchar(30) NOT NULL,
  `idTopic` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Participate`
--

CREATE TABLE `Participate` (
  `idSingleSession` int(11) NOT NULL,
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

-- --------------------------------------------------------

--
-- Structure de la table `Rank`
--

CREATE TABLE `Rank` (
  `idStudent` int(11) NOT NULL,
  `idQuestion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  `dateAppointement` date NOT NULL,
  `idSubject` int(11) NOT NULL,
  `idTeacher` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `SingleSession`
--

CREATE TABLE `SingleSession` (
  `idSingleRevision` int(11) NOT NULL,
  `dateAppointement` date NOT NULL,
  `idSubject` int(11) NOT NULL,
  `idStudent` int(11) NOT NULL,
  `idTeacher` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Skill`
--

CREATE TABLE `Skill` (
  `idSkill` int(11) NOT NULL,
  `nomSkill` varchar(50) NOT NULL,
  `markSkill` varchar(50) NOT NULL,
  `idStudent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(2, 't', 't', 't', 't', 't');

-- --------------------------------------------------------

--
-- Structure de la table `Study`
--

CREATE TABLE `Study` (
  `idStudent` int(11) NOT NULL,
  `idClass` int(11) NOT NULL,
  `nameStatus` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Subject`
--

CREATE TABLE `Subject` (
  `idSubject` int(11) NOT NULL,
  `nameSubject` varchar(30) NOT NULL,
  `idClass` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  ADD PRIMARY KEY (`idSingleSession`,`idStudent`);

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
-- AUTO_INCREMENT pour la table `Student`
--
ALTER TABLE `Student`
  MODIFY `idStudent` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
