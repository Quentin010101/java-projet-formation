-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le : dim. 26 fév. 2023 à 21:44
-- Version du serveur : 5.7.33
-- Version de PHP : 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `projet-formation-java`
--

-- --------------------------------------------------------

--
-- Structure de la table `category`
--

CREATE TABLE `category` (
  `categoryid` int(11) NOT NULL,
  `type` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `category`
--

INSERT INTO `category` (`categoryid`, `type`) VALUES
(1, 'nature'),
(2, 'sport'),
(3, 'technologie'),
(4, 'fashion'),
(5, 'architecture'),
(6, 'portrait'),
(7, 'landscape'),
(8, 'art'),
(9, 'creative'),
(10, 'beautiful'),
(11, 'pictureperfect'),
(12, 'streetlife'),
(13, 'urbanjungle'),
(14, 'lifestyle');

-- --------------------------------------------------------

--
-- Structure de la table `image`
--

CREATE TABLE `image` (
  `imageid` int(11) NOT NULL,
  `image_path` varchar(255) NOT NULL,
  `title` varchar(40) NOT NULL,
  `description` text NOT NULL,
  `userid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `image`
--

INSERT INTO `image` (`imageid`, `image_path`, `title`, `description`, `userid`) VALUES
(2, '/image/06046f29-650f-4a73-8988-8afacd07fa1f.jpg', 'Tranquility', 'Indulge in the tranquility of this peaceful yoga pose 🧘‍♀️ The poised figure is gracefully balanced on one leg, with arms extended towards the sky. The serene expression on their face reflects the inner peace and focus they have achieved through their practice. Embrace this moment of stillness and tap into your own inner power.', 2),
(4, '/image/9227f9bb-7b07-4d09-be55-2d19851ee187.jpg', 'Beauty', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 3),
(5, '/image/34591cf3-c941-4a75-8a7e-d1eb6d446e0b.jpg', 'Tranquility', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 4),
(6, '/image/18750097-6aac-40e1-93e2-39dae8dcc1f5.jpg', 'Creation', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(7, '/image/bfedebb1-2fda-475f-aa29-45c8f8d72b39.jpg', 'Curtain ', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 2),
(8, '/image/d994687e-4fa0-4fc4-acec-997dd6bfd1d1.jpg', 'Blooming garden', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 6),
(9, '/image/f91f2f13-922e-4b55-b4d7-1a7b7451c6e9.png', 'warmth', 'Soak in the warmth of a cozy fireplace 🔥 The flickering flame dances and crackles, creating a soothing ambiance.', 3),
(30, '/image/4cbc8961-5026-4716-b7d4-9b3629f9b575.jpg', 'sdfg', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(31, '/image/f7e6006e-faca-4bfa-90ed-e57e97fcd0ae.jpg', 'ertyert', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(32, '/image/648a33fa-8a63-4344-b8e7-72c982572874.jpg', 'hello', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(33, '/image/cededba5-a051-434c-be1f-287b3dc2cd55.jpg', 'sdfg', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(34, '/image/dd03c524-76b7-44e1-8459-fa101b8f1982.jpg', 'dfgh', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(35, '/image/99d07d6c-4cf3-4fa7-b0d6-a739076b7188.jpg', 'dfghdfgh', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(36, '/image/b88eb03d-1de9-4a3d-9b81-5acb40e22001.jpg', 'sdfg', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(37, '/image/94fb9bc7-e074-4b97-8a04-142502c27574.jpg', 'dswf', 'Get lost in nature\'s beauty 🌳 Trees tower overhead, casting dappled shadows on the forest floor below.', 6),
(38, '/image/f4e6ff5c-17d0-4268-8261-50305b3774c9.jpg', 'sdfgsdfg', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(39, '/image/f9f41fc2-73c4-481f-9757-ccc0cef4af1c.jpg', 'sdfhgsdfg', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(40, '/image/660d2643-6e3c-42cf-bcc0-995fd01c3681.jpg', 'cfvhgj', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(41, '/image/544f31c4-1f9c-4742-9369-da9f69b34d11.jpg', '(e-yu', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(42, '/image/7fdc765b-adb8-41cc-8342-5d11ed856a2f.jpg', 'azretzert', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(43, '/image/c1f5613f-f17b-4744-9d31-a2d99ee97f5c.jpg', '\'etr', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(44, '/image/021b6c6d-be53-4ae7-9e04-03daad6836aa.jpg', 'sdfg', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(45, '/image/ea787315-ebb4-43c8-b9c0-4e3d212c3c1d.jpg', 'rtyj', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(46, '/image/10bb9dca-caf9-40db-865d-71c6acc7b6ae.jpg', 'ftyj', 'Take a stroll through the city streets 🚶‍♀️ Skyscrapers reach towards the sky, creating a stunning urban skyline.', 6),
(47, '/image/2364fb01-ab1e-4d0c-995e-37a0e514946b.png', 'gh', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 7),
(48, '/image/d9353298-38c6-4176-a2b9-451d5ea8d5ab.jpg', 'dsfg', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 6),
(49, '/image/eadedbbe-167d-4176-b105-5bf4aee708e1.jpg', 'fghj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 8),
(50, '/image/4aa8791a-028d-4a1b-90c7-cbf827c71042.jpg', 'fgh', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 8),
(51, '/image/5124e94c-6a6c-4173-a218-ee393ad0ff5f.jpg', 'fghj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 8),
(52, '/image/92502ca0-773a-417e-b316-358c7d28c9fe.jpg', 'fghj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 8),
(53, '/image/e2e342f7-1165-4ae8-8777-169a5f3097c7.jpg', 'fhgj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 8),
(54, '/image/c6dda4d6-6f32-4f69-9418-646cd38ae3b7.jpg', 'fhgj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 8),
(55, '/image/1a1a28c6-e300-4d44-a184-5ae83016f108.jpg', 'rhtgj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 9),
(56, '/image/322826f6-7f3b-4eeb-b685-ceaa2090cae7.jpg', 'fghj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 9),
(57, '/image/733f93f5-0937-4659-a1aa-7c754225a38d.jpg', 'fghj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 9),
(58, '/image/17ee4fad-9221-41b0-abf7-5d564306d74d.jpg', 'fhgj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 9),
(59, '/image/cecd02fb-7dbf-4821-b796-c21d94eb230f.jpg', 'fghj', 'Explore the beauty of a blooming garden 🌸 A riot of color and fragrance, with flowers and shrubs of every hue.', 9),
(60, '/image/ee3f4984-1935-4c7d-9756-1985be102b44.jpg', 'wxcvbwcx', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 9),
(61, '/image/5f8b3a2d-a79d-4c57-b8c6-1fab98ea3466.jpg', 'fg', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 6),
(62, '/image/23788a38-e53d-4ca6-984e-bbd850ac7769.jpg', 'fdgh', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 6),
(63, '/image/ad3a042c-48e4-4800-877a-fe1d7e24395c.jpg', 'dfgh', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 6),
(64, '/image/028ad473-0110-4d9e-ad49-cd0371bde97d.jpg', 'azer', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 6),
(65, '/image/58c958a6-97e9-4b46-9cd5-7052a1124a57.jpg', 'etrhdth', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 6),
(66, '/image/6bf993df-41e7-4267-b344-e9f135713383.jpg', 'dfghd', 'Admire the power of a waterfall 💦 Water tumbles over rocks, creating a mesmerizing curtain of mist.', 7),
(67, '/image/cdf7a1d3-8cd2-487d-9226-73ab4b17a9ce.jpg', 'Paysage', 'Beautifull field in the middle of nowhere', 7),
(68, '/image/2364fb01-ab1e-4d0c-995e-37a0e514946b.png', 'gh', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 7),
(69, '/image/d9353298-38c6-4176-a2b9-451d5ea8d5ab.jpg', 'dsfg', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 6),
(70, '/image/eadedbbe-167d-4176-b105-5bf4aee708e1.jpg', 'fghj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 8),
(71, '/image/4aa8791a-028d-4a1b-90c7-cbf827c71042.jpg', 'fgh', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 8),
(72, '/image/5124e94c-6a6c-4173-a218-ee393ad0ff5f.jpg', 'fghj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 8),
(73, '/image/92502ca0-773a-417e-b316-358c7d28c9fe.jpg', 'fghj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 8),
(74, '/image/e2e342f7-1165-4ae8-8777-169a5f3097c7.jpg', 'fhgj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 8),
(75, '/image/c6dda4d6-6f32-4f69-9418-646cd38ae3b7.jpg', 'fhgj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 8),
(76, '/image/1a1a28c6-e300-4d44-a184-5ae83016f108.jpg', 'rhtgj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 9),
(77, '/image/322826f6-7f3b-4eeb-b685-ceaa2090cae7.jpg', 'fghj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 9),
(78, '/image/733f93f5-0937-4659-a1aa-7c754225a38d.jpg', 'fghj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 9),
(79, '/image/17ee4fad-9221-41b0-abf7-5d564306d74d.jpg', 'fhgj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 9),
(80, '/image/cecd02fb-7dbf-4821-b796-c21d94eb230f.jpg', 'fghj', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 9),
(81, '/image/ee3f4984-1935-4c7d-9756-1985be102b44.jpg', 'wxcvbwcx', 'Soak up the sun on a sandy beach 🏖️ The clear blue water laps gently at the shore, inviting you to take a swim.', 9),
(82, '/image/96137e40-4783-4795-ac68-8801244a880c.jpg', 'fghjfghj', 'fghjfghjfghj', 6),
(83, '/image/9d3c4fbf-561d-4d5c-be3d-a659b62e9911.jpg', 'qsdf', 'qsdfqsdf', 7),
(84, '/image/77c20759-10db-44ea-b91c-bdc0d5db01c4.jpg', 'test claire', 'sdfgsdfg', 7),
(85, '/image/fbd508e0-9281-4e54-a4ac-3c5a03943604.jpg', 'test kant', 'sdfgsdfg', 6),
(86, '/image/c1767eb2-adde-4b0c-819b-5a35494d038d.jpg', 'test', 'sdfgsfdg', 8);

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

CREATE TABLE `message` (
  `messageid` int(11) NOT NULL,
  `pseudo_reciever` varchar(40) NOT NULL,
  `pseudo_sender` varchar(40) NOT NULL,
  `text` text NOT NULL,
  `date` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `message`
--

INSERT INTO `message` (`messageid`, `pseudo_reciever`, `pseudo_sender`, `text`, `date`) VALUES
(5, 'Claire', 'Kant01', 'Hi, nice image!!', 1677086775569),
(10, 'Claire', 'Kant01', 'Hi claire', 1677145877578),
(12, 'Kant01', 'Kant01', 'hello', 1677150488983),
(18, 'Kant01', 'Claire', 'Hello Kant', 1677229578969),
(19, 'Claire', 'Kant01', 'dfghdfghdfgh', 1677249342185);

-- --------------------------------------------------------

--
-- Structure de la table `pivot_category_image`
--

CREATE TABLE `pivot_category_image` (
  `id` int(11) NOT NULL,
  `imageid` int(11) NOT NULL,
  `categoryid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `pivot_category_image`
--

INSERT INTO `pivot_category_image` (`id`, `imageid`, `categoryid`) VALUES
(3, 2, 1),
(4, 2, 4),
(5, 2, 3),
(7, 4, 4),
(8, 5, 3),
(9, 6, 1),
(10, 6, 4),
(11, 7, 2),
(12, 7, 3),
(13, 8, 4),
(14, 8, 1),
(15, 9, 2),
(16, 9, 4),
(17, 9, 3),
(18, 44, 2),
(19, 44, 3),
(20, 44, 4),
(21, 45, 1),
(22, 45, 2),
(23, 45, 3),
(24, 45, 4),
(25, 46, 1),
(26, 47, 4),
(27, 48, 8),
(28, 48, 2),
(29, 48, 12),
(30, 48, 11),
(31, 49, 1),
(32, 49, 7),
(33, 49, 13),
(34, 50, 3),
(35, 50, 2),
(36, 50, 10),
(37, 51, 6),
(38, 51, 11),
(39, 51, 12),
(40, 51, 7),
(41, 51, 14),
(42, 52, 12),
(43, 52, 14),
(44, 52, 10),
(45, 52, 9),
(46, 52, 8),
(47, 52, 3),
(48, 52, 4),
(49, 53, 14),
(50, 53, 3),
(51, 53, 4),
(52, 53, 5),
(53, 53, 13),
(54, 53, 6),
(55, 53, 11),
(56, 54, 14),
(57, 54, 4),
(58, 54, 5),
(59, 54, 11),
(60, 54, 7),
(61, 54, 8),
(62, 54, 9),
(63, 54, 10),
(64, 55, 13),
(65, 55, 5),
(66, 55, 9),
(67, 55, 7),
(68, 55, 11),
(69, 56, 13),
(70, 56, 5),
(71, 56, 9),
(72, 56, 11),
(73, 56, 10),
(74, 56, 8),
(75, 56, 6),
(76, 57, 13),
(77, 57, 5),
(78, 57, 9),
(79, 57, 11),
(80, 57, 10),
(81, 57, 8),
(82, 57, 6),
(83, 57, 12),
(84, 57, 14),
(85, 57, 3),
(86, 58, 5),
(87, 58, 9),
(88, 58, 11),
(89, 58, 10),
(90, 58, 8),
(91, 58, 6),
(92, 58, 14),
(93, 58, 7),
(94, 59, 5),
(95, 59, 11),
(96, 59, 10),
(97, 59, 8),
(98, 59, 14),
(99, 59, 1),
(100, 59, 4),
(101, 59, 13),
(102, 59, 12),
(103, 59, 6),
(104, 60, 14),
(105, 60, 4),
(106, 60, 13),
(107, 60, 12),
(108, 60, 3),
(109, 60, 7),
(110, 61, 7),
(111, 61, 8),
(112, 61, 6),
(113, 61, 11),
(114, 62, 8),
(115, 62, 11),
(116, 62, 2),
(117, 62, 9),
(118, 62, 14),
(119, 63, 11),
(120, 63, 2),
(121, 63, 14),
(122, 63, 7),
(123, 63, 12),
(124, 63, 13),
(125, 64, 14),
(126, 64, 12),
(127, 64, 1),
(128, 64, 6),
(129, 64, 8),
(130, 64, 9),
(131, 64, 10),
(132, 64, 5),
(133, 65, 2),
(134, 65, 8),
(135, 66, 2),
(136, 66, 11),
(137, 66, 12),
(138, 66, 6),
(139, 66, 14),
(140, 67, 1),
(141, 67, 10),
(142, 67, 14),
(143, 67, 7),
(144, 82, 1),
(145, 82, 10),
(146, 82, 3),
(147, 82, 11),
(148, 82, 4),
(149, 82, 12),
(150, 83, 2),
(151, 83, 10),
(152, 83, 11),
(153, 83, 3),
(154, 84, 2),
(155, 84, 1),
(156, 85, 2),
(157, 85, 9),
(158, 85, 10),
(159, 85, 1),
(160, 86, 3),
(161, 86, 4),
(162, 86, 12);

-- --------------------------------------------------------

--
-- Structure de la table `pivot_image_user`
--

CREATE TABLE `pivot_image_user` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `imageid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `pivot_image_user`
--

INSERT INTO `pivot_image_user` (`id`, `userid`, `imageid`) VALUES
(4, 2, 8),
(5, 2, 5),
(6, 2, 2),
(8, 4, 9),
(9, 4, 8),
(10, 4, 7),
(11, 4, 6),
(12, 4, 5),
(13, 4, 4),
(15, 4, 2),
(18, 6, 8),
(19, 6, 9),
(20, 6, 7),
(21, 6, 4),
(23, 6, 2),
(24, 4, 44),
(25, 8, 44),
(26, 9, 44),
(27, 7, 64),
(28, 6, 64),
(29, 2, 64),
(30, 3, 30),
(31, 4, 30),
(32, 6, 30),
(33, 8, 30),
(34, 7, 32),
(35, 6, 32),
(36, 4, 65),
(37, 6, 42),
(38, 8, 61),
(39, 4, 32),
(40, 4, 41),
(41, 4, 58),
(42, 2, 37),
(43, 9, 66),
(44, 8, 58),
(45, 3, 64),
(46, 9, 47),
(47, 7, 66),
(48, 8, 8);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `userid` int(11) NOT NULL,
  `session_id` varchar(255) DEFAULT NULL,
  `pseudo` varchar(30) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `surname` varchar(30) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(40) NOT NULL,
  `avatar_path` varchar(256) DEFAULT NULL,
  `country` varchar(40) DEFAULT NULL,
  `role` varchar(30) NOT NULL,
  `date` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`userid`, `session_id`, `pseudo`, `name`, `surname`, `password`, `email`, `avatar_path`, `country`, `role`, `date`) VALUES
(2, NULL, 'jean', NULL, NULL, '123', 'a@gmail.com', NULL, NULL, 'ROLE_USER', NULL),
(3, NULL, 'marie', NULL, NULL, '254', 'marie@gmail.com', NULL, NULL, 'ROLE_ADMIN', NULL),
(4, NULL, 'Jeanne', 'paul', NULL, '654', 'Jeane@gmail.com', NULL, NULL, 'ROLE_USER', NULL),
(6, '947B364576D7E8E80CD9404CCA274626', 'Kant01', 'Quentin', 'coz', '$2a$10$prdTK8M4azyMvotCKFgMKuradIqO8HObUrQS0ysnT/jCNMQl4Ka/m', 'q@gmail.com', '/avatar/7679a65c-c726-44b7-97a7-c4cfaa03fd40.jpg', 'France', 'ROLE_USER', 1676296666865),
(7, '', 'Claire', 'Claire', 'Jhon', '$2a$10$UpTpE/m4wv4f02m9M0z3ouplJs9SsFP1MBlbZYAm.b/i/nDlWoc4W', 'Claire@gmail.com', '/avatar/624ea895-7281-45a5-95d8-79b204c00e49.png', NULL, 'ROLE_USER', 1677057191242),
(8, 'CD074F72CD94EDEFB060EDA8C6A05123', 'Amanda', NULL, NULL, '$2a$10$pijvU5.s7TMaD7Fni9rP2uJ7bDtaFD6RU8Rm52tc/bG5VEnEuu/Zi', 'A@gmail.com', NULL, NULL, 'ROLE_USER', 1677062159330),
(9, 'C061F6DCAD3A1F5B2697312D74A56E6A', 'James', NULL, NULL, '$2a$10$PporNSn/fheTRBe/U.ZYqeqD7sKAo8Of1C9V7MzGKOSpxxmItiYaK', 'J@gmail.com', NULL, NULL, 'ROLE_USER', 1677062291052),
(10, '9A35B3C52F9D9B53006C82A23BDFBAE3', 'Quent', NULL, NULL, '$2a$10$1IvTmyw91zeP81bc5x7CH.vE2pJv6hzw9/p9m4BbVtV0ivIXIXufq', 'Quent@gmail.com', NULL, NULL, 'ROLE_USER', 1677153090038),
(11, '94182CAF31122297A56F0312BAC26884', 'Jason', NULL, NULL, '$2a$10$Xo8UiYlYiA/tBuM8vIEEBOw7DSfa65d8DiRp3JLJLjD.gYVZdeve.', 'J@gmail.com', NULL, NULL, 'ROLE_USER', 1677228692165);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`categoryid`);

--
-- Index pour la table `image`
--
ALTER TABLE `image`
  ADD PRIMARY KEY (`imageid`),
  ADD KEY `userid` (`userid`);

--
-- Index pour la table `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`messageid`),
  ADD KEY `pseudoReciever` (`pseudo_reciever`),
  ADD KEY `pseudoSender` (`pseudo_sender`);

--
-- Index pour la table `pivot_category_image`
--
ALTER TABLE `pivot_category_image`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categoryid` (`categoryid`),
  ADD KEY `pivot-category-image_ibfk_2` (`imageid`);

--
-- Index pour la table `pivot_image_user`
--
ALTER TABLE `pivot_image_user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `imageid` (`imageid`),
  ADD KEY `pivot-image-user_ibfk_2` (`userid`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`),
  ADD UNIQUE KEY `Secondary` (`pseudo`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `category`
--
ALTER TABLE `category`
  MODIFY `categoryid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `image`
--
ALTER TABLE `image`
  MODIFY `imageid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=87;

--
-- AUTO_INCREMENT pour la table `message`
--
ALTER TABLE `message`
  MODIFY `messageid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT pour la table `pivot_category_image`
--
ALTER TABLE `pivot_category_image`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=163;

--
-- AUTO_INCREMENT pour la table `pivot_image_user`
--
ALTER TABLE `pivot_image_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `image`
--
ALTER TABLE `image`
  ADD CONSTRAINT `image_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`);

--
-- Contraintes pour la table `message`
--
ALTER TABLE `message`
  ADD CONSTRAINT `message_ibfk_1` FOREIGN KEY (`pseudo_reciever`) REFERENCES `user` (`pseudo`),
  ADD CONSTRAINT `message_ibfk_2` FOREIGN KEY (`pseudo_sender`) REFERENCES `user` (`pseudo`);

--
-- Contraintes pour la table `pivot_category_image`
--
ALTER TABLE `pivot_category_image`
  ADD CONSTRAINT `pivot_category_image_ibfk_1` FOREIGN KEY (`categoryid`) REFERENCES `category` (`categoryid`),
  ADD CONSTRAINT `pivot_category_image_ibfk_2` FOREIGN KEY (`imageid`) REFERENCES `image` (`imageid`);

--
-- Contraintes pour la table `pivot_image_user`
--
ALTER TABLE `pivot_image_user`
  ADD CONSTRAINT `pivot_image_user_ibfk_1` FOREIGN KEY (`imageid`) REFERENCES `image` (`imageid`),
  ADD CONSTRAINT `pivot_image_user_ibfk_2` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
