CREATE SEQUENCE public.offer_seq
    START WITH 1
    INCREMENT BY 1
    NO CYCLE;

ALTER TABLE public.offer
    ALTER COLUMN id SET DEFAULT nextval('public.offer_seq');

SELECT setval('public.offer_seq', COALESCE((SELECT MAX(id) FROM public.offer), 1), false);